package com.lyll.user_server.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/test")
public class TestController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/test")
    public String test(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }

}
