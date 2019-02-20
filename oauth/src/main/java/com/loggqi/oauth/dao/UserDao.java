package com.loggqi.oauth.dao;

import com.loggqi.oauth.eneity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created with IDEA
 * author:L.M
 * Date:2019/1/25
 * Time:16:50
 **/
public interface UserDao extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
