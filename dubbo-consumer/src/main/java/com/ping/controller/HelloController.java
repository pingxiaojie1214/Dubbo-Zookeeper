package com.ping.controller;

import com.ping.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private TestService testService;

    @RequestMapping("/hello")
    public String hello() {
        testService.test();
        return "aaaaa";
    }

}
