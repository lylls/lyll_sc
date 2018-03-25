package com.lyll.isblog_web.test.controller;

import com.lyll.isblog_web.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping(value = "/test")
    public String hi(@RequestParam String name){
        String s = testService.testMethod(name);
        return s;
    }
}
