package com.example.homework3.controller;

import com.example.homework3.entity.User;
import com.example.homework3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }

    @PostMapping("/insert")
    public String insert(@RequestBody User user){
        userService.insert(user);
        return "insert success";
    }
}
