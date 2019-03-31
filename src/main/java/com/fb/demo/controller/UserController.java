package com.fb.demo.controller;

import com.fb.demo.entity.UserEntity;
import com.fb.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
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
    int insertUser(@Valid UserEntity userEntity, BindingResult br){
        if(br.hasErrors()){
            //数据格式有错
            List<FieldError> fieldErrorsList = br.getFieldErrors();
            Map<String,Object> errorMessageMap = new HashMap<>();
            for (FieldError fieldError:fieldErrorsList){
                 //错误的字段名
                String fieldName = fieldError.getField();
                String message = fieldError.getDefaultMessage();
                errorMessageMap.put(fieldName,message);
            }
            return 0;
        }else{
            return userService.insertUser(userEntity);
        }
    }

    @RequestMapping("/deleteUser")
    int insertUser(String id){
        return userService.delUserById(id);
    }
}
