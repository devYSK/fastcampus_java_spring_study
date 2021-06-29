package com.ysk;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class URLEncoder implements IEncoder {

    public String encode(String message) {
        return java.net.URLEncoder.encode(message, StandardCharsets.UTF_8);
    }
}
