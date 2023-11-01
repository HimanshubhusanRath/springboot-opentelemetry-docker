package com.hr.serviceb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getMessage")
public class ServiceBController {

    @GetMapping
    public String getMessage()
    {
        return "This is service-B";
    }
}
