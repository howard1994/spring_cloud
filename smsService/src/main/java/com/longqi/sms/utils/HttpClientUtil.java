package com.longqi.sms.utils;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * Created with IDEA
 * author:L.M
 * Date:2019/1/16
 * Time:10:31
 **/
public class HttpClientUtil {
    public static String postJson(String url,String json){
        String result = null;
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpResponse response = null;
        try{
            HttpPost httpPost = new HttpPost(url);
            RequestConfig requestConfig = RequestConfig.custom()
                    .setConnectTimeout(10000)
                    .setSocketTimeout(10000)
                    .build();
            httpPost.setConfig(requestConfig);
            httpPost.setHeader("Accept", "application/json");
            httpPost.setHeader("Content-Type", "application/json;charset=utf-8");
            httpPost.setEntity(new ByteArrayEntity(json.getBytes("UTF-8")));
            response = httpClient.execute(httpPost);
            if (response!=null){
                HttpEntity resEntity = response.getEntity();
                if (resEntity!=null){
                    result = EntityUtils.toString(resEntity,"UTF-8");
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                httpClient.close();
                if (response!=null){
                    ((CloseableHttpResponse) response).close();
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        return result;
    }
}
