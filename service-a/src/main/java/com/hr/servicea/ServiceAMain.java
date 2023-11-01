package com.hr.servicea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ServiceAMain {
    public static void main(String[] args) {
        SpringApplication.run(ServiceAMain.class, args);
    }

    @Bean
    RestTemplate restTemplate(final RestTemplateBuilder builder)
    {
        return builder.build();
    }

}