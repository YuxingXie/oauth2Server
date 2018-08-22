package com.lingyun.oauth2.client.framework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Oauth2ClientController {
    @RequestMapping("/")
    public String index(){
        return "home";
    }
}
