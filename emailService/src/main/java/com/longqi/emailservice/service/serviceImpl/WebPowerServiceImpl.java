package com.longqi.emailservice.service.serviceImpl;

import com.longqi.emailservice.service.WebPowerService;
import mypackage.*;
import org.springframework.stereotype.Service;

/**
 * Created with IDEA
 * author:L.M
 * Date:2019/1/7
 * Time:15:04
 **/
@Service
public class WebPowerServiceImpl implements WebPowerService {
    private WebpowerSoapAPI webpowerSoapAPI = new WebpowerSoapAPI();
    private WebpowerSoapAPIPort webpowerSoapAPIPort = webpowerSoapAPI.getWebpowerSoapAPIPort();

    @Override
    /**
    * @Description: getMailingId
    * @Param: [webpowerLoginType, campaignID, mailingName]
    * @return: java.lang.Integer
    * @Author: L.M
    * @Date: 2019/1/23
    **/
    public Integer getMailingId(WebpowerLoginType webpowerLoginType, Integer campaignID, String mailingName) {
        MailingArrayType mailings = getMailings(webpowerLoginType, campaignID, 0, false);
        Integer mailingId = -1;
        for (MailingType mailing :
                mailings.getMailing()) {
            if (mailing.getName().toLowerCase().trim().equals(mailingName.toLowerCase().trim())) {
                mailingId = mailing.getId();
                break;
            }
            if (mailing.getName().toLowerCase().trim().equals("test".toLowerCase().trim())) {
                mailingId = mailing.getId();
            }
        }
        return mailingId;
    }

    @Override
    /**
    * @Description: getMailings
    * @Param: [webpowerLoginType, campaignID, limit, definitiveOnly]
    * @return: mypackage.MailingArrayType
    * @Author: L.M
    * @Date: 2019/1/23
    **/
    public MailingArrayType getMailings(WebpowerLoginType webpowerLoginType, Integer campaignID, Integer limit, Boolean definitiveOnly) {
        return webpowerSoapAPIPort.getMailings(webpowerLoginType, campaignID, limit, definitiveOnly);
    }

    @Override
    /**
    * @Description: addRecipientsSendMailing
    * @Param: [webpowerLoginType, campaignID, mailingID, groupIDs, recipientDatas, addDuplisToGroups, overwrite]
    * @return: mypackage.AddRecipientsResultType
    * @Author: L.M
    * @Date: 2019/1/23
    **/
    public AddRecipientsResultType addRecipientsSendMailing(WebpowerLoginType webpowerLoginType,
                                                            Integer campaignID, Integer mailingID,
                                                            ArrayOfIntType groupIDs,
                                                            NewRecipientArrayType recipientDatas,
                                                            Boolean addDuplisToGroups, Boolean overwrite) {
        return webpowerSoapAPIPort.addRecipientsSendMailing(webpowerLoginType, campaignID, mailingID, groupIDs,
                recipientDatas, addDuplisToGroups, overwrite);
    }

    @Override
    /**
    * @Description: creatMailing
    * @Param: [webpowerLoginType, campaignID, mailingName, lang, subject, fromName, senderID, html, preheader]
    * @return: mypackage.RecordResultType
    * @Author: L.M
    * @Date: 2019/1/23
    **/
    public RecordResultType creatMailing(WebpowerLoginType webpowerLoginType, Integer campaignID,
                                         String mailingName, String lang, String subject,
                                         String fromName, Integer senderID, String html, String preheader) {
        return webpowerSoapAPIPort.createMailing(webpowerLoginType, campaignID, mailingName, lang, subject, fromName, senderID, html, preheader);
    }

    @Override
    /**
    * @Description: getGroupId
    * @Param: [webpowerLoginType, groupName, campaignId]
    * @return: java.lang.Integer
    * @Author: L.M
    * @Date: 2019/1/23
    **/
    public Integer getGroupId(WebpowerLoginType webpowerLoginType, String groupName, Integer campaignId) {
        GroupArrayType groups = getGroup(webpowerLoginType, campaignId);
        Integer groupId = -1;
        for (GroupType group : groups.getGroup()) {
            if (group.isIsActive() &&
                    !group.isIsTest() &&
                    group.getName().trim().toLowerCase().equals(groupName.trim().toLowerCase())) {
                groupId = group.getId();
                break;
            }
            if (group.getName().trim().toLowerCase().equals("emailService".trim().toLowerCase())) {
                groupId = group.getId();
            }
        }
        return groupId;
    }

    @Override
    /**
    * @Description: getGroup
    * @Param: [webpowerLoginType, campaignId]
    * @return: mypackage.GroupArrayType
    * @Author: L.M
    * @Date: 2019/1/23
    **/
    public GroupArrayType getGroup(WebpowerLoginType webpowerLoginType, Integer campaignId) {
        return webpowerSoapAPIPort.getGroups(webpowerLoginType, campaignId);
    }

    @Override
    /**
    * @Description: getCampaignId
    * @Param: [campaignName, webpowerLoginType]
    * @return: java.lang.Integer
    * @Author: L.M
    * @Date: 2019/1/23
    **/
    public Integer getCampaignId(String campaignName, WebpowerLoginType webpowerLoginType) {
        CampaignArrayType campaignArray = getCampaign(webpowerLoginType);
        Integer campaignId = -1;
        for (CampaignType campaign : campaignArray.getCampaign()) {
            if (campaign.getName().trim().toLowerCase().equals(campaignName.toLowerCase().trim())) {
                campaignId = campaign.getId();
                break;
            }
            if (campaign.getName().trim().toLowerCase().equals("emailService".toLowerCase().trim())) {
                campaignId = campaign.getId();
            }
        }
        return campaignId;
    }

    @Override
    /**
     * @Description: webPowerLogin
     * @Param: [userName, passWard]
     * @return: mypackage.WebpowerLoginType
     * @Author: L.M
     * @Date: 2019/1/7
     **/
    public WebpowerLoginType webPowerLogin(String userName, String passWard) {
        WebpowerLoginType webpowerLoginType = new WebpowerLoginType();
        webpowerLoginType.setUsername(userName);
        webpowerLoginType.setPassword(passWard);
        return webpowerLoginType;
    }

    @Override
    /**
     * @Description: newGroupType
     * @Param: [name, isTest, remarks]
     * @return: mypackage.NewGroupType
     * @Author: L.M
     * @Date: 2019/1/7
     **/
    public NewGroupType newGroupType(String name, Boolean isTest, String remarks) {
        NewGroupType newGroupType = new NewGroupType();
        newGroupType.setIsTest(isTest);
        newGroupType.setName(name);
        newGroupType.setRemarks(remarks);
        return newGroupType;
    }

    @Override
    /**
     * @Description: getCampaign
     * @Param: [webpowerLoginType]
     * @return: mypackage.CampaignArrayType
     * @Author: L.M
     * @Date: 2019/1/9
     **/
    public CampaignArrayType getCampaign(WebpowerLoginType webpowerLoginType) {
        return webpowerSoapAPIPort.getCampaigns(webpowerLoginType);
    }

    @Override
    /**
     * @Description: addGrouop
     * @Param: [webpowerLoginType, campaignID, newGroupType]
     * @return: mypackage.RecordResultType
     * @Author: L.M
     * @Date: 2019/1/23
     **/
    public RecordResultType addGrouop(WebpowerLoginType webpowerLoginType, Integer campaignID, NewGroupType newGroupType) {
        return webpowerSoapAPIPort.addGroup(webpowerLoginType, campaignID, newGroupType);
    }
}
