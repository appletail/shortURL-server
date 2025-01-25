package com.appletail.shorturl.service.url;

import com.appletail.shorturl.dto.url.request.UrlCreateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UrlService {

    public void createUrl(UrlCreateRequest request) {
        // 1. url을 단축한다.
        // 2. 단축한 url을 DB에 저장한다.
        // 3. 새로 생성한 url을 반환한다.
    }

}
