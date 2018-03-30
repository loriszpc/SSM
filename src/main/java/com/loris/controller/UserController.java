package com.loris.controller;

import com.loris.entity.User;
import com.loris.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author loris
 * @date 2018/3/29 17:14
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/list")
    @ResponseBody
    public List<User> getUserList(){
        return userService.selectUserList();
    }

    @RequestMapping("/addUser")
    public String addUser(){
        List<User> userList=new ArrayList<User>();
        for(int i=100;i<110;i++){
            User user=new User();
            user.setId(i);
            user.setPassword(i+"");
            user.setUserName(i+"-loris");
            userList.add(user);
        }
        int count=userService.addUser(userList);
        return null;
    }

}
