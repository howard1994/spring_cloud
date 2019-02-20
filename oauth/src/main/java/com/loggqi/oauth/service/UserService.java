package com.loggqi.oauth.service;

import com.loggqi.oauth.dao.UserDao;
import com.loggqi.oauth.eneity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created with IDEA
 * author:L.M
 * Date:2019/1/25
 * Time:16:53
 **/
@Component
public class UserService implements UserDetailsService {
    @Autowired
    private UserDao userDao;
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        return userDao.findByUsername(userName);
    }

    public User save(User user) {
        return userDao.saveAndFlush(user);
    }
}
