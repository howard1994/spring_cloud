package com.longqi.emailservice.entity;


import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class EmailIndex {
    private Long id;

    private String sendName;

    private Date createTime;

    private Date sendTime;

    private String creatUser;

    private String sendStatus;

    private String sendStatusMsg;

    private List<EmailItem> emailItems;
}