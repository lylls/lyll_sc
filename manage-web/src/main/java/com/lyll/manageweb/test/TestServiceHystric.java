package com.lyll.manageweb.test;

import org.springframework.stereotype.Component;

@Component
public class TestServiceHystric implements TestService {

    @Override
    public String test(String name) {
        return "sorry "+name;
    }
}
