package com.longqi.emailservice.service.serviceImpl;

import com.alibaba.fastjson.JSON;
import com.longqi.emailservice.service.WebPowerService;
import mypackage.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created with IDEA
 * author:L.M
 * Date:2019/1/23
 * Time:11:07
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class WebPowerServiceImplTest {
    @Autowired
    private WebPowerService webPowerService;

    @Test
    public void getCampaignId() {
        WebpowerLoginType webpowerLoginType = webPowerService.webPowerLogin("unicemall", "*0901UNicehair");
        int emailService = webPowerService.getCampaignId("emailService", webpowerLoginType);
        System.out.println(emailService);
    }

    @Test
    public void webPowerLogin() {
    }

    @Test
    public void newGroupType() {
    }

    @Test
    public void getCampaign() {
    }

    @Test
    public void addGrouop() {
    }

    @Test
    public void getGroupId() {
        WebpowerLoginType webpowerLoginType = webPowerService.webPowerLogin("unicemall", "*0901UNicehair");
        int emailService = webPowerService.getCampaignId("emailService", webpowerLoginType);
        int email = webPowerService.getGroupId(webpowerLoginType, "email", emailService);
        System.out.println(email);
    }

    @Test
    public void getGroup() {

    }

    @Test
    public void creatMailing() {
        try {
            WebpowerLoginType webpowerLoginType = webPowerService.webPowerLogin("unicemall", "*0901UNicehair");
            int emailService = webPowerService.getCampaignId("emailService", webpowerLoginType);
            String testHtml = String.format("<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"><title>test</title></head><body><p>%s</p></body></html>", "testHtml");
            RecordResultType recordResultType = webPowerService.creatMailing(webpowerLoginType, emailService, "test", "en", "testsubject", "testfromName", 0, testHtml, "testprehead");
            System.out.println(recordResultType.getId());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    public void addRecipientsSendMailing() {
        try {
            WebpowerLoginType webpowerLoginType = webPowerService.webPowerLogin("unicemall", "*0901UNicehair");
            int campaignId = webPowerService.getCampaignId("emailService", webpowerLoginType);
            int groupId = webPowerService.getGroupId(webpowerLoginType, "email", campaignId);
            Integer mailingId = webPowerService.getMailingId(webpowerLoginType, campaignId, "test");
            ArrayOfIntType groupIds = new ArrayOfIntType();
            groupIds.getInt().add(groupId);
            NewRecipientArrayType newRecipientArrayType = new NewRecipientArrayType();
            NewRecipientType newRecipientType = new NewRecipientType();
            RecipientNameValuePairType recipientNameValuePairType = new RecipientNameValuePairType();
            recipientNameValuePairType.setName("email");
            recipientNameValuePairType.setValue("565449577@qq.com");
            newRecipientType.getFields().add(recipientNameValuePairType);
            RecipientNameValuePairType recipientNameValuePairType1 = new RecipientNameValuePairType();
            recipientNameValuePairType1.setName("name");
            recipientNameValuePairType1.setValue("howard");
            newRecipientType.getFields().add(recipientNameValuePairType1);
            newRecipientArrayType.getRecipients().add(newRecipientType);
            AddRecipientsResultType addRecipientsResultType = webPowerService.addRecipientsSendMailing(webpowerLoginType,campaignId, mailingId, groupIds, newRecipientArrayType, false, false);
            String s = JSON.toJSONString(groupIds);
            System.out.println(s);
            String s1 = JSON.toJSONString(newRecipientArrayType);
            System.out.println(s1);
            System.out.println(addRecipientsResultType.getStatus());
        } catch (Exception ex) {
            System.out.println(ex);
        }


    }

    @Test
    public void getMailings() {
        WebpowerLoginType webpowerLoginType = webPowerService.webPowerLogin("unicemall", "*0901UNicehair");
        int emailService = webPowerService.getCampaignId("emailService", webpowerLoginType);
        MailingArrayType mailings = webPowerService.getMailings(webpowerLoginType, emailService, 0, false);
        System.out.println(mailings.getMailing().toString());
    }
}