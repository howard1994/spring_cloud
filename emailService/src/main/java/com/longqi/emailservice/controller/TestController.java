package com.longqi.emailservice.controller;

import com.longqi.emailservice.JsonModel.ResponseJsonModel;
import com.longqi.emailservice.entity.EmailIndex;
import com.longqi.emailservice.service.EmailIndexService;
import com.longqi.emailservice.service.WebPowerService;
import mypackage.CampaignArrayType;
import mypackage.CampaignType;
import mypackage.WebpowerLoginType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IDEA
 * author:L.M
 * Date:2018/12/27
 * Time:9:40
 **/
@RestController
@RequestMapping("/api")
public class TestController {
    @Value("${webpower.password}")
    private String passWord;
    @Value("${webpower.username}")
    private String userName;
    @Value("${webpower.defaultGroupName}")
    private String defaultGroupName;
    @Value("${webpower.defaultCampaignName}")
    private String defaultCampaignName;
    @Autowired
    private WebPowerService webPowerService;
    @RequestMapping(value = "/test")
    public ResponseJsonModel Test(@RequestParam(value = "token") String token){
        WebpowerLoginType webpowerLogin = webPowerService.webPowerLogin(userName, passWord);
        CampaignArrayType campaign = webPowerService.getCampaign(webpowerLogin);
        ResponseJsonModel responseJsonModel = new ResponseJsonModel("1","",token);
        return  responseJsonModel;
    }
    public void TestTry(){
        Integer CampaignId;
        WebpowerLoginType webpowerLogin = webPowerService.webPowerLogin(userName, passWord);
        CampaignArrayType campaign = webPowerService.getCampaign(webpowerLogin);
        for(CampaignType campaignType:campaign.getCampaign()){
            if (campaignType.getName().contains("")){
                CampaignId = campaignType.getId();
                break;
            }
            if (campaignType.getName().toLowerCase().trim().equals(defaultGroupName)){


            }

        }
    }
}
