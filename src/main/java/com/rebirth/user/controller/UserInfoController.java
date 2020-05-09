package com.rebirth.user.controller;

import com.rebirth.user.entity.UserInfo;
import com.rebirth.user.service.impl.UserInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/user")
public class UserInfoController {


    @Autowired
    private UserInfoServiceImpl userService;

    @RequestMapping("index")
    public String index() {
        return "Hello world";
    }

    @RequestMapping("/queryUserById")
    public UserInfo selectUserById(Integer  id) {
        System.out.println("id:" + id);
        UserInfo user = userService.selectByPrimaryKey(id);
        System.out.println(user.toString());
        return user;
    }

}
