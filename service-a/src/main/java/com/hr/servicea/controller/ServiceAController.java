package com.hr.servicea.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@RestController
@RequestMapping("/getRemoteMessage")
public class ServiceAController {

    @Value("${SERVICE_B_HOST}")
    private String host;

    @Value("${SERVICE_B_PORT}")
    private String port;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public String getMessage()
    {
        System.out.println("Service-A calling service-B for message");
        return restTemplate.getForObject("http://"+host+":"+port+"/getMessage",String.class, new HashMap<>());
    }
}
