package com.lyll.manageweb.test;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "USER-SERVER",fallback = TestServiceHystric.class)
public interface TestService {

    @RequestMapping(value = "/test/test",method = RequestMethod.GET)
    public String test(@RequestParam(value = "name") String name);

}
