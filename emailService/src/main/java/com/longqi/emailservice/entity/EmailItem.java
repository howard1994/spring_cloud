package com.longqi.emailservice.entity;

import lombok.Data;

import java.util.Date;
@Data
public class EmailItem {
    private Long id;

    private String emailAddress;

    private String emailUser;

    private String sendResult;

    private Boolean isSuccess;

    private Date creatTime;

    private Date sendTime;

    private Long indexId;

}