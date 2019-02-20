package com.longqi.emailservice.controller;

import com.alibaba.fastjson.JSON;
import com.longqi.emailservice.JsonModel.ReqEmailJsonModel;
import com.longqi.emailservice.JsonModel.ResponseJsonModel;
import com.longqi.emailservice.service.WebPowerService;
import mypackage.AddRecipientsResultType;
import mypackage.ArrayOfIntType;
import mypackage.WebpowerLoginType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IDEA
 * author:L.M
 * Date:2019/1/23
 * Time:9:48
 **/
@RestController
@RequestMapping("/api")
public class EmailSendController {
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

    @RequestMapping(value = "/sendEmail", method = RequestMethod.POST)
    public ResponseJsonModel addRecipientsSendMailing(@RequestBody ReqEmailJsonModel reqEmailJsonModel) {
        WebpowerLoginType webpowerLoginType = webPowerService.webPowerLogin(userName, passWord);
        int campaignId = webPowerService.getCampaignId(reqEmailJsonModel.campaign, webpowerLoginType);
        int groupId = webPowerService.getGroupId(webpowerLoginType, reqEmailJsonModel.group, campaignId);
        ArrayOfIntType groupIds = new ArrayOfIntType();
        groupIds.getInt().add(groupId);
        int mailingId = webPowerService.getMailingId(webpowerLoginType, campaignId, reqEmailJsonModel.mailing);
        AddRecipientsResultType addRecipientsResultType = webPowerService.addRecipientsSendMailing(webpowerLoginType, campaignId, mailingId, groupIds, reqEmailJsonModel.recipientDatas, false, false);
        String s = JSON.toJSONString(addRecipientsResultType);
        System.out.println(s);
        return new ResponseJsonModel("1", "success", "r");
    }

}
