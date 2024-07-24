package dev.phelipemon.EncurtadorURL.Links;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Map;

@RestController
public class LinkController {

    @Autowired
    private LinkService linkService;

    @PostMapping("/encurta-url")
    public ResponseEntity<LinkResponse> generateShortnedUrl(@RequestBody Map<String, String> request){

        String originalUrl = request.get("urlOriginal");
        Link link = linkService.shortenUrl(originalUrl);

        String generateUserRedirectUrl = "http://localhost:8080/r/" + link.getUrlShortened();

        LinkResponse response = new LinkResponse(
                link.getId(),
                link.getUrlLong(),
                generateUserRedirectUrl,
                link.getUrlQrCode(),
                link.getUrlCreatedIn()
        );

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/r/{urlShortened}")
    public void redirectLink(@PathVariable String urlShortened, HttpServletResponse response) throws IOException {
        Link link = linkService.getOriginalUrl(urlShortened);

        if (link != null){
            response.sendRedirect(link.getUrlLong());
        }else {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
    }

}
