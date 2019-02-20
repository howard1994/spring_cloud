package com.longqi.sms.entity;

import lombok.Data;

import java.util.List;

/**
 * Created with IDEA
 * author:L.M
 * Date:2019/1/16
 * Time:10:14
 **/
@Data
public class ResponseCommon {
    public String code;
    public String msg;
    public String count;
    public String create_date;
    public String smsid;
    public String mobile;
    public String uid;
    public String count_sum;
    public List<ResCommonList> report;
}
