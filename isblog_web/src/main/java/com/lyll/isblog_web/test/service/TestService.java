package com.lyll.isblog_web.test.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "testError")
    public String testMethod(String name) {
        String forObject = restTemplate.getForObject("http://USER-SERVER/hi?name=" + name, String.class);
        return forObject;
    }

    public String testError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
