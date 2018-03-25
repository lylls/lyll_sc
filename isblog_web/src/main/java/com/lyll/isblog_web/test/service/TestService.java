package com.lyll.isblog_web.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService {

    @Autowired
    RestTemplate restTemplate;

    public String testMethod(String name) {
        String forObject = restTemplate.getForObject("http://USER-SERVER/hi?name=" + name, String.class);
        return forObject;
    }
}
