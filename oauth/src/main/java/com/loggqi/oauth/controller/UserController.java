package com.loggqi.oauth.controller;

import com.loggqi.oauth.eneity.User;
import com.loggqi.oauth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IDEA
 * author:L.M
 * Date:2019/1/28
 * Time:13:37
 **/
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
    @RequestMapping("/login")
    @PreAuthorize("hasAnyAuthority('admin')")
    public User reg(@RequestBody User user){
        User user1 =null;
        try{
            user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
            user1 = userService.save(user);
        }catch (Exception e){

        }
        return user1;
    }
}
