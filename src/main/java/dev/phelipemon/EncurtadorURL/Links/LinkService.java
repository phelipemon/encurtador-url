package dev.phelipemon.EncurtadorURL.Links;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class LinkService {

    private LinkRepository linkRepository;

    public LinkService(LinkRepository repository) {
        this.linkRepository = repository;
    }

    //Gerar URL aleatoria
    //TODO: REFATORAR PARA INCLUIR PARTE DA URL ORIGINAL NO NOSSO ALGORITIMO DE GERACAO DE URL
    public String generateRandomUrl(){
        return RandomStringUtils.randomAlphanumeric(5,10);
    }

    public Link shortenUrl(String originalUrl){
        Link link = new Link();
        link.setUrlLong(originalUrl);
        link.setUrlShortened(generateRandomUrl());
        link.setUrlCreatedIn(LocalDateTime.now());
        link.setUrlQrCode("QR CODE INDISPONÍVEL NO MOMENTO");

        return linkRepository.save(link);

    }

    public Link getOriginalUrl(String urlShortened){
        try {
            return linkRepository.findByUrlShortened(urlShortened);

        }catch (Exception exception){
            throw new RuntimeException("URL não existe em nossos registros", exception);
        }
    }


}
