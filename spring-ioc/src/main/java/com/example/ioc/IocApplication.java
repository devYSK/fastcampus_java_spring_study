package com.example.ioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class IocApplication {

    public static void main(String[] args) {
        SpringApplication.run(IocApplication.class, args);

        ApplicationContext context = ApplicationContextProvider.getContext();

//        BaseEncoder baseEncoder = context.getBean(BaseEncoder.class);
//        URLEncoder urlEncoder = context.getBean(URLEncoder.class);
        String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";




        Encoder encoder = context.getBean(Encoder.class);

        String result = encoder.encode(url);

        System.out.println(result);

        result = encoder.encode(url);

        System.out.println(result);

    }

}

@Configuration
class AppConfig {

    @Bean("baseEncode")
    public Encoder encoder(BaseEncoder baseEncoder) {
        return new Encoder(baseEncoder);
    }

    @Bean("uRLEncode")
    public Encoder encoder(URLEncoder urlEncoder) {
        return new Encoder(urlEncoder);
    }

}