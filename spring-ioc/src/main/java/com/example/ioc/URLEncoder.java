package com.example.ioc;

import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

@Component
public class URLEncoder implements IEncoder{

    public String encode(String message) {
        return java.net.URLEncoder.encode(message, StandardCharsets.UTF_8);
    }
}
