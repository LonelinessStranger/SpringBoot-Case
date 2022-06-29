package com.casus.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    /**
     * 测试使用
     */
    @RequestMapping("/user/login")
    public String login(String userName, String passWord) {
        String UserName = "张三";
        String PassWord = "123456";
        if (userName.equals(UserName) && passWord.equals(PassWord)) {
            return "登录成功!";
        } else {
            return "登录失败!";
        }
    }

}
