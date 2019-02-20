package com.longqi.emailservice.service;

import mypackage.*;

/**
 * Created with IDEA
 * author:L.M
 * Date:2019/1/5
 * Time:9:39
 **/
public interface WebPowerService {
    //获取模板Id
    Integer getMailingId(WebpowerLoginType webpowerLoginType,Integer campaignID,String mailingName);
    //获取模板
    MailingArrayType getMailings(WebpowerLoginType webpowerLoginType,Integer campaignID,Integer limit,Boolean definitiveOnly);
    //发送邮件
    AddRecipientsResultType addRecipientsSendMailing(WebpowerLoginType webpowerLoginType,
                                                     Integer campaignID,Integer mailingID,ArrayOfIntType groupIDs,
                                                     NewRecipientArrayType recipientDatas,
                                                     Boolean addDuplisToGroups,Boolean overwrite);
    //创建模板
    RecordResultType creatMailing(WebpowerLoginType webpowerLoginType,
                                  Integer campaignID,
                                  String mailingName,
                                  String lang,
                                  String subject,
                                  String fromName,
                                  Integer senderID,
                                  String html,
                                  String preheader);

    //获取分组Id
    Integer getGroupId(WebpowerLoginType webpowerLoginType, String groupName, Integer campaignId);

    //获取分组列表
    GroupArrayType getGroup(WebpowerLoginType webpowerLoginType, Integer campaignId);

    //获取活动Id
    Integer getCampaignId(String campaignName, WebpowerLoginType webpowerLoginType);

    //登录Model
    WebpowerLoginType webPowerLogin(String userName, String passWard);

    //获取所有活动
    CampaignArrayType getCampaign(WebpowerLoginType webpowerLoginType);

    //新建分组Model
    NewGroupType newGroupType(String name, Boolean isTest, String remarks);

    //创建分组
    RecordResultType addGrouop(WebpowerLoginType webpowerLoginType, Integer campaignID, NewGroupType newGroupType);
}
