package com.example.client.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service

public class RestTemplateService {

    // http://localhost/api/server/hello
    // response를 받아온다

    public String hello() {
        URI uri = UriComponentsBuilder
                .fromUriString("http://localhost")
                .path("/api/server/hello")
                .encode()
                .build()
                .toUri();


        System.out.println(uri.toString());

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        return result;
    }
}
