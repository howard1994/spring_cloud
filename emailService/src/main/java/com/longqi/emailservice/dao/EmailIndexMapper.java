package com.longqi.emailservice.dao;

import com.longqi.emailservice.entity.EmailIndex;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface EmailIndexMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EmailIndex record);

    int insertSelective(EmailIndex record);

    EmailIndex selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EmailIndex record);

    int updateByPrimaryKey(EmailIndex record);
}