package com.fb.demo.service;

import com.fb.demo.entity.UserEntity;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<Map<String,Object>> findAllUsers();

    int insertUser(UserEntity userEntity);

    int delUserById(String id);
}
