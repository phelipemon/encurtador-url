package dev.phelipemon.EncurtadorURL.Links;

import java.time.LocalDateTime;

public class LinkResponse {
    private Long id;

    private String urlLong;
    private String urlShortened;
    private String urlQrCode;
    private LocalDateTime urlCreatedIn;

    public LinkResponse(Long id, String urlLong, String urlShortened, String urlQrCode, LocalDateTime urlCreatedIn) {
        this.id = id;
        this.urlLong = urlLong;
        this.urlShortened = urlShortened;
        this.urlQrCode = urlQrCode;
        this.urlCreatedIn = urlCreatedIn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrlLong() {
        return urlLong;
    }

    public void setUrlLong(String urlLong) {
        this.urlLong = urlLong;
    }

    public String getUrlShortened() {
        return urlShortened;
    }

    public void setUrlShortened(String urlShortened) {
        this.urlShortened = urlShortened;
    }

    public String getUrlQrCode() {
        return urlQrCode;
    }

    public void setUrlQrCode(String urlQrCode) {
        this.urlQrCode = urlQrCode;
    }

    public LocalDateTime getUrlCreatedIn() {
        return urlCreatedIn;
    }

    public void setUrlCreatedIn(LocalDateTime urlCreatedIn) {
        this.urlCreatedIn = urlCreatedIn;
    }
}
