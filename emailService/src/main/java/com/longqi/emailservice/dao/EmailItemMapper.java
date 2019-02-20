package com.longqi.emailservice.dao;

import com.longqi.emailservice.entity.EmailIndex;
import com.longqi.emailservice.entity.EmailItem;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface EmailItemMapper {
    int insertEmailItem(EmailIndex emailIndex);
    int deleteByPrimaryKey(Long id);

    int insert(EmailItem record);

    int insertSelective(EmailItem record);

    EmailItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EmailItem record);

    int updateByPrimaryKey(EmailItem record);
}