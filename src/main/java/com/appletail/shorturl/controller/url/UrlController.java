package com.appletail.shorturl.controller.url;
import com.appletail.shorturl.dto.url.request.UrlCreateRequest;
import com.appletail.shorturl.service.url.UrlService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UrlController {

    private final UrlService urlService;

    public UrlController(UrlService urlService) {
        this.urlService = urlService;
    }

    @PostMapping("/shorturl")
    public void createUrl(@RequestBody UrlCreateRequest request) {
        urlService.createUrl(request);
    }
}
