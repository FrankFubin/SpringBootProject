package com.fb.demo.controller;

import com.fb.demo.entity.UserEntity;
import com.fb.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/selectAllUsers")
    List<Map<String,Object>> selectAllUsers(){
        return userService.findAllUsers();
    }
    @RequestMapping("/insertUser")
    int insertUser(UserEntity userEntity){
        return userService.insertUser(userEntity);
    }

    @RequestMapping("/deleteUser")
    int insertUser(String id){
        return userService.delUserById(id);
    }
}
