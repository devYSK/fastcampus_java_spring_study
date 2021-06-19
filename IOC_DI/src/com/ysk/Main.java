package com.ysk;

public class Main {

    public static void main(String[] args) {

        String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";

        Encoder encoder = new Encoder(new BaseEncoder());
        //encoder = new Encoder(new URLEncoder());
        String result = encoder.encode(url);

        System.out.println(result);
    }
}
