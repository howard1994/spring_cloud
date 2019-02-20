package com.longqi.feign.service;

import com.longqi.feign.service.hystrix.TestServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sun.awt.SunHints;

/**
 * Created with IDEA
 * author:L.M
 * Date:2018/12/28
 * Time:17:19
 **/
@Service
@FeignClient(value = "emailService",fallback = TestServiceHystrix.class)
public interface TestService {
    @RequestMapping(value = "/api/test")
    public String Test(@RequestParam(value = "token") String token);
}
