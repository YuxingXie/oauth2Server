package com.lingyun.oauth2.client.framework.controller;

import com.lingyun.oauth2.client.framework.model.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class Oauth2ClientRestController {
    @RequestMapping("/user")
    @CrossOrigin
    public User index(HttpServletRequest request, HttpServletResponse response){

//        for (Cookie cookie : request.getCookies()) {
//            System.out.println(cookie.getName()+":"+cookie.getValue());
//        }
        Cookie cookie=new Cookie("user","susu");
        response.addCookie(cookie);
        System.out.println("session id:"+request.getSession().getId());
        return new User(1l,"susu",14,2000d);
    }

}
