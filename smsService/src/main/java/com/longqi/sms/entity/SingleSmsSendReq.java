package com.longqi.sms.entity;

import lombok.Data;

/**
 * Created with IDEA
 * author:L.M
 * Date:2019/1/16
 * Time:10:05
 **/
@Data
public class SingleSmsSendReq {
    public String sid;
    public String token;
    public String appid;
    public String templateid;
    public String param;
    public String mobile;
    public String uid;

    public SingleSmsSendReq() {
    }
    public SingleSmsSendReq(String sid, String token, String appid, String templateid, String param, String mobile, String uid) {
        this.sid = sid;
        this.token = token;
        this.appid = appid;
        this.templateid = templateid;
        this.param = param;
        this.mobile = mobile;
        this.uid = uid;
    }

    public SingleSmsSendReq(ApiSecret apiSecret, String templateid, String param, String mobile, String uid) {
        this.sid = apiSecret.sid;
        this.token = apiSecret.token;
        this.appid = apiSecret.appid;
        this.templateid = templateid;
        this.param = param;
        this.mobile = mobile;
        this.uid = uid;
    }
}
