package com.longqi.sms.service.serviceImpl;

import com.longqi.sms.entity.ApiSecret;
import com.longqi.sms.service.AppSecretService;
import org.springframework.stereotype.Service;

/**
 * Created with IDEA
 * author:L.M
 * Date:2019/1/16
 * Time:10:21
 **/
@Service
public class AppSecretServiceImpl implements AppSecretService {
    @Override
    public ApiSecret createApiSecret(String sid, String token, String appid) {
        return new ApiSecret(sid,token,appid);
    }
}
