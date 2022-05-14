package com.example.tms.controller;

import com.example.tms.domain.ResponseResult;
import com.example.tms.domain.User;
import com.example.tms.service.LoginServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private LoginServcie loginServcie;

    @PostMapping("/login")
    public ResponseResult login(@RequestBody User user) {
        //登录
        return loginServcie.login(user);
    }

    @RequestMapping("/logout")
    public ResponseResult logout() {
        return loginServcie.logout();
    }
}
