package com.longqi.emailservice.JsonModel;

import lombok.Data;
import mypackage.NewRecipientArrayType;

/**
 * Created with IDEA
 * author:L.M
 * Date:2019/1/23
 * Time:8:44
 **/
@Data
public class ReqEmailJsonModel {
    //分组名,找不到的话默认emailService分组
    public String group;
    //活动名
    public String campaign;
    //模板,空的话创建
    public String mailing;
    //内容
    public String content;

    public NewRecipientArrayType recipientDatas;

}
