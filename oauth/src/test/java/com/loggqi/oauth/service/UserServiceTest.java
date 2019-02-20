package com.loggqi.oauth.service;

import com.loggqi.oauth.dao.UserDao;
import com.loggqi.oauth.eneity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created with IDEA
 * author:L.M
 * Date:2019/1/25
 * Time:16:54
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserDao userDao;
    @Test
    public void loadUserByUsername() {
        try {
            User howard = userDao.findByUsername("howard");
            System.out.println(howard.getUsername());
        }catch (Exception ex){
            System.out.println(ex);
        }

    }
}