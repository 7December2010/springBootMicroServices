package com.example.dina.demo.controller;

import com.example.dina.demo.beans.UserDetails;
import com.example.dina.demo.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class HelloController {
    @Autowired
    private UserDetailService service;

    @GetMapping("/getUserDetails/{userName}")
    public UserDetails getUserDetails(@RequestParam(name = "userName", required = true) String userName) {
        return service.getUserDetailByEmailId(userName);
    }
    @GetMapping("/getUserDetails")
    public List<UserDetails> getAllUserDetails() {
        return service.getAllUserDetails();
    }
}
