package com.longqi.sms.service.serviceImpl;

import com.alibaba.fastjson.JSON;
import com.longqi.sms.entity.ApiSecret;
import com.longqi.sms.entity.ResponseCommon;
import com.longqi.sms.entity.SingleSmsSendReq;
import com.longqi.sms.service.SingleSmsSendService;
import com.longqi.sms.utils.HttpClientUtil;
import org.springframework.stereotype.Service;

/**
 * Created with IDEA
 * author:L.M
 * Date:2019/1/16
 * Time:10:25
 **/
@Service
public class SingleSmsSendServiceImpl implements SingleSmsSendService {
    @Override
    public ResponseCommon sendSms(ApiSecret apiSecret, String url, String templateid, String param, String mobile, String uid) {
        SingleSmsSendReq singleSmsSendReq = new SingleSmsSendReq(apiSecret,templateid,param,mobile,uid);
        String json = JSON.toJSONString(singleSmsSendReq);
        String response = HttpClientUtil.postJson(url+"sendsms", json);
        ResponseCommon responseCommon = null;
        try {
            responseCommon = JSON.parseObject(response, ResponseCommon.class);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return responseCommon;
    }
}
