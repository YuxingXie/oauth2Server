package com.websystique.springmvc.controller;

import com.websystique.springmvc.model.User;
import com.websystique.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
//@SessionAttributes("authorizationRequest")
public class HelloWorldController {

//    @RequestMapping("/oauth/token")
//    public String getAccessConfirmation(Map<String, Object> model, HttpServletRequest request)
//            throws Exception {
//
//        return "oauth/oauth_approval";
//    }
}