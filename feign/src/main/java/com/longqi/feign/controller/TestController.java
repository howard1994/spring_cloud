package com.longqi.feign.controller;

import com.longqi.feign.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IDEA
 * author:L.M
 * Date:2018/12/28
 * Time:17:22
 **/
@RestController
public class TestController {
    @Autowired
    private TestService testService;
    @RequestMapping(value = "/api/test")
    public String Test(@RequestParam String token){
        return testService.Test(token);
    }
}
