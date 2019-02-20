package com.longqi.emailservice.JsonModel;

import lombok.Data;

import java.util.Dictionary;
import java.util.List;

/**
 * Created with IDEA
 * author:L.M
 * Date:2018/12/27
 * Time:9:58
 **/
@Data
public class EmailSingleSend {
    public String content;
    public String placeHold;
    public List<EmailUser> emailList;
}
class EmailUser{
    public String email;
}

