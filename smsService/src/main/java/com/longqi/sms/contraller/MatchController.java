package com.longqi.sms.contraller;

import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IDEA
 * author:L.M
 * Date:2019/2/15
 * Time:11:29
 **/
@RestController
@RequestMapping("/match")
public class MatchController {
    private PasswordEncoder bCryptPasswordEncoder = new  BCryptPasswordEncoder();
    @RequestMapping("/match")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public Boolean isMatch(@RequestParam String user,@RequestParam String pass){
        boolean matches = bCryptPasswordEncoder.matches(pass,user);
        return  matches;
    }
    @RequestMapping("/encode")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String encode(@RequestParam String str){
        return bCryptPasswordEncoder.encode(str);
    }

}
