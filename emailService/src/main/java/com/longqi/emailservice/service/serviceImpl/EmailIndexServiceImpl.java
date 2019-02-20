package com.longqi.emailservice.service.serviceImpl;

import com.longqi.emailservice.dao.EmailIndexMapper;
import com.longqi.emailservice.entity.EmailIndex;
import com.longqi.emailservice.service.EmailIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IDEA
 * author:L.M
 * Date:2019/1/22
 * Time:16:51
 **/
@Service
public class EmailIndexServiceImpl implements EmailIndexService {
    @Autowired
    /**
    * @Description: 
    * @Param: 
    * @return: 
    * @Author: L.M
    * @Date: 2019/1/23
    **/ 
    private EmailIndexMapper emailIndexMapper;

    @Override
    /**
    * @Description: getById
    * @Param: [id]
    * @return: com.longqi.emailservice.entity.EmailIndex
    * @Author: L.M
    * @Date: 2019/1/23
    **/ 
    public EmailIndex getById(Long id) {
        return emailIndexMapper.selectByPrimaryKey(id);
    }

    @Override
    /**
    * @Description: insert
    * @Param: [emailIndex]
    * @return: long
    * @Author: L.M
    * @Date: 2019/1/23
    **/ 
    public long insert(EmailIndex emailIndex) {
        return emailIndexMapper.insert(emailIndex);
    }
}
