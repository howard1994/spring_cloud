package com.longqi.emailservice.service.serviceImpl;

import com.longqi.emailservice.dao.EmailIndexMapper;
import com.longqi.emailservice.dao.EmailItemMapper;
import com.longqi.emailservice.entity.EmailIndex;
import com.longqi.emailservice.entity.EmailItem;
import com.longqi.emailservice.service.EmailItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IDEA
 * author:L.M
 * Date:2019/1/22
 * Time:21:38
 **/
@Service
public class EmailItemServiceImpl implements EmailItemService {
    @Autowired
    private EmailItemMapper emailItemMapper;
    @Override
    /**
    * @Description: insertEmailIndex
    * @Param: [emailIndex]
    * @return: int
    * @Author: L.M
    * @Date: 2019/1/23
    **/ 
    public int insertEmailIndex(EmailIndex emailIndex) {
        for (EmailItem emailItem:emailIndex.getEmailItems()) {
            emailItem.setIndexId(emailIndex.getId());
        }
        int i = emailItemMapper.insertEmailItem(emailIndex);
        return i;
    }
}
