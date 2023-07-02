package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: idea_springboot_myabtis_jsp
 * @description:
 * @author: wjl
 * @create: 2023-07-02 23:26
 **/
@RestController
public class MethodController {
    @Autowired
    private UserService userService;

    @RequestMapping("GetUserById/{id}")
    public User GetUserById(@PathVariable int id){
        User user =  userService.Sel(id);
        System.out.println("xxxxxxxxxxxxxxxxxx"+user.toString());
        return user;
    }

    @RequestMapping("PostUserById")
    public User PostUserById(@RequestParam("id") int id){
        User user =  userService.Sel(id);
        System.out.println("xxxxxxxxxxxxxxxxxx"+user.toString());
        return user;
    }
}
