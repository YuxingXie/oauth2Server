package com.lingyun.oauth2.client.framework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class Oauth2ClientController {
    @RequestMapping("/")
    public String index(HttpServletRequest request, HttpServletResponse response){
        response.setStatus(401);
        System.out.println(request.getAuthType());
        response.setHeader("WWW-Authenticate","sfsdfdsfdsfdsfdsfdsds");
        response.setHeader("sdfsd-sfsfdsfds","sfsdfdsfdsfdsfdsfdsds");
//        for (Cookie cookie : request.getCookies()) {
//
//            System.out.println(cookie.getName()+":"+cookie.getValue());
//
//        }
        Cookie cookie=new Cookie("key","value");
        response.addCookie(cookie);
        System.out.println("session id:"+request.getSession().getId());

        return "home";
    }

}
