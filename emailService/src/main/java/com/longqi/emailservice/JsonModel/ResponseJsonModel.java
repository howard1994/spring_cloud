package com.longqi.emailservice.JsonModel;

import lombok.Data;

import java.util.List;

/**
 * Created with IDEA
 * author:L.M
 * Date:2018/12/27
 * Time:9:42
 **/
@Data
public class ResponseJsonModel {
    public String states;
    public String message;
    public Object content;

    public ResponseJsonModel(String states, String message, Object content) {
        this.states = states;
        this.message = message;
        this.content = content;
    }
}
