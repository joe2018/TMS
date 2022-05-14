package com.example.tms.service;


import com.example.tms.domain.ResponseResult;
import com.example.tms.domain.User;

public interface LoginServcie {

    ResponseResult login(User user);

    ResponseResult logout();

}
