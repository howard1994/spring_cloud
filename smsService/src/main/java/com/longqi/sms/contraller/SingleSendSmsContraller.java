package com.longqi.sms.contraller;

import com.longqi.sms.entity.ApiSecret;
import com.longqi.sms.entity.ResponseCommon;
import com.longqi.sms.entity.SingleSmsSendReq;
import com.longqi.sms.service.AppSecretService;
import com.longqi.sms.service.SingleSmsSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IDEA
 * author:L.M
 * Date:2019/1/16
 * Time:11:09
 **/
@RestController
@RequestMapping("/")
public class SingleSendSmsContraller {
    @Autowired
    private SingleSmsSendService singleSmsSendService;
    @Value("${sms.app-id}")
    private String appId;
    @Value("${sms.account-sid}")
    private String appSid;
    @Value("${sms.auth-token}")
    private String authToken;
    @Value("${sms.rest-url}")
    private String url;

    @RequestMapping("/singleSend")
    public ResponseCommon singleSend(@RequestBody SingleSmsSendReq singleSmsSendReq){
        ApiSecret apiSecret =new ApiSecret(appSid,authToken,appId);
        ResponseCommon responseCommon = singleSmsSendService.sendSms(apiSecret, url, "422548", singleSmsSendReq.param, singleSmsSendReq.mobile, singleSmsSendReq.uid);
        return responseCommon;
    }

}
