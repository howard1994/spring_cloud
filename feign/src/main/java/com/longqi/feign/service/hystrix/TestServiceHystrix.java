package com.longqi.feign.service.hystrix;

import com.longqi.feign.service.TestService;
import org.springframework.stereotype.Component;

/**
 * Created with IDEA
 * author:L.M
 * Date:2018/12/29
 * Time:10:33
 **/
@Component
public class TestServiceHystrix implements TestService {
    @Override
    public String Test(String token) {
        return "网络异常";
    }
}
