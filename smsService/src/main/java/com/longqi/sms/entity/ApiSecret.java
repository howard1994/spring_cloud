package com.longqi.sms.entity;

import lombok.Data;

/**
 * Created with IDEA
 * author:L.M
 * Date:2019/1/16
 * Time:10:09
 **/
@Data
public class ApiSecret {
    public String sid;
    public String token;
    public String appid;

    public ApiSecret(String sid, String token, String appid) {
        this.sid = sid;
        this.token = token;
        this.appid = appid;
    }
}
