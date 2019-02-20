package com.longqi.sms.service;

import com.longqi.sms.entity.ApiSecret;

/**
 * Created with IDEA
 * author:L.M
 * Date:2019/1/16
 * Time:10:18
 **/
public interface AppSecretService {
    ApiSecret createApiSecret(String sid,String token,String appid);
}
