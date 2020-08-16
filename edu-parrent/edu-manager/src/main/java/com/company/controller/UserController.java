package com.company.controller;

import com.company.model.User;
import com.company.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author kaichenkai
 * @date 2020-08-15 00:38
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping(value = "find", method = RequestMethod.GET)
    public User findById(Integer id) {
        User user = userService.findById(id);
        System.out.println(user);
        return user;
    }

    @RequestMapping("login")
    public ModelAndView login() {
        return new ModelAndView("Default");
    }


    @RequestMapping("manage")
    public ModelAndView manage() {
        return new ModelAndView("User/UserInfo");
    }

    @RequestMapping("info")
    public ModelAndView info() {
        return new ModelAndView("User/UserInfo");
    }
}
