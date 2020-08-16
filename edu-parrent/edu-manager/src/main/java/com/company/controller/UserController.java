package com.company.controller;

import com.company.model.User;
import com.company.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author kaichenkai
 * @date 2020-08-15 00:38
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public void login(){
        System.out.println("login");
    }

    @RequestMapping(value = "find", method = RequestMethod.GET)
    public User findById(Integer id){
        User user = userService.findById(id);
        System.out.println(user);
        return user;
    }
}
