package com.longqi.emailservice.service.serviceImpl;

import com.longqi.emailservice.entity.EmailIndex;
import com.longqi.emailservice.entity.EmailItem;
import com.longqi.emailservice.service.EmailIndexService;
import com.longqi.emailservice.service.EmailItemService;
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
 * Date:2019/1/22
 * Time:21:43
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class EmailItemServiceImplTest {
    @Autowired
    private EmailIndexService emailIndexService;
    @Autowired
    private EmailItemService emailItemService;

    @Test
    public void insertEmailIndex() {
        try {
            EmailIndex emailIndex = new EmailIndex();
            emailIndex.setSendName("789");
            emailIndexService.insert(emailIndex);
            Long id = emailIndex.getId();
            List<EmailItem> emailItems = new ArrayList<EmailItem>();
            for (int i = 0;i<5;i++){
                EmailItem emailItem = new EmailItem();
                emailItem.setEmailAddress("test"+i);
                emailItem.setIndexId(id);
                emailItems.add(emailItem);
            }
            emailIndex.setEmailItems(emailItems);
            int i = emailItemService.insertEmailIndex(emailIndex);
            System.out.println(i);
        }
        catch (Exception ex){
            System.out.println(ex);
        }

    }
}