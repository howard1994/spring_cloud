package com.longqi.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * Created with IDEA
 * author:L.M
 * Date:2019/1/16
 * Time:10:01
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableResourceServer
public class SmsServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SmsServiceApplication.class,args);
    }
}
