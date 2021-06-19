package com.ysk;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class BaseEncoder implements IEncoder{


    public String encode(String message) {
        return Base64.getEncoder().encodeToString(message.getBytes(StandardCharsets.UTF_8));
    }
}
