package com.longqi.emailservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created with IDEA
 * author:L.M
 * Date:2018/12/28
 * Time:15:52
 **/
@MapperScan("com.longqi.emailservice.dao")
@SpringBootApplication
@EnableEurekaClient
public class EmailServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmailServiceApplication.class,args);
    }
}
