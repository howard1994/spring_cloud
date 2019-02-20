package com.longqi.emailservice.service.serviceImpl;

import com.longqi.emailservice.entity.EmailIndex;
import com.longqi.emailservice.service.EmailIndexService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created with IDEA
 * author:L.M
 * Date:2019/1/22
 * Time:16:53
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class EmailIndexServiceImplTest {
    @Autowired
    private EmailIndexService emailIndexService;

    @Test
    public void getById() {
        try {
            EmailIndex byId = emailIndexService.getById((long) 3);
            Long integer = byId.getId();
            System.out.println(integer);
        }
        catch (Exception ex){
            System.out.println(ex);
        }


    }

    @Test
    public void insert() {
        EmailIndex emailIndex = new EmailIndex();
        emailIndex.setSendName("test");
        long insert = emailIndexService.insert(emailIndex);
        System.out.println(insert);
    }
}