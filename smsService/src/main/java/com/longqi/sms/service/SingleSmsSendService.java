package com.longqi.sms.service;

import com.longqi.sms.entity.ApiSecret;
import com.longqi.sms.entity.ResponseCommon;

/**
 * Created with IDEA
 * author:L.M
 * Date:2019/1/16
 * Time:10:18
 **/
public interface SingleSmsSendService {
    ResponseCommon sendSms(ApiSecret apiSecret,String url,String templateid,String param,String mobile,String uid);
}
