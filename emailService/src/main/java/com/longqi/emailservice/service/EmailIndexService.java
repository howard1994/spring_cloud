package com.longqi.emailservice.service;

import com.longqi.emailservice.entity.EmailIndex;
import org.springframework.stereotype.Service;

/**
 * Created with IDEA
 * author:L.M
 * Date:2019/1/22
 * Time:16:51
 **/
public interface EmailIndexService {
    EmailIndex getById(Long id);
    long insert(EmailIndex emailIndex);

}
