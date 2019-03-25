package com.fb.demo.service.impl;

import com.fb.demo.entity.UserEntity;
import com.fb.demo.mapper.UserMapper;
import com.fb.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional(readOnly = false)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Map<String, Object>> findAllUsers() {
        return userMapper.getAllUsers();
    }

    @Override
    public int insertUser(UserEntity userEntity) {
        return userMapper.addUser(userEntity);
    }

    @Override
    public int delUserById(String id) {
        return userMapper.delUserById(id);
    }
}
