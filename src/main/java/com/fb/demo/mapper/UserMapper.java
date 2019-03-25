package com.fb.demo.mapper;

import com.fb.demo.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserMapper {

    @Select("select * from user")
    List<Map<String,Object>> getAllUsers();

    @Insert("insert into user(id,name,age,email,phone,birth,create_by,create_date,update_by,update_date) values(#{id},#{name},#{age},#{email},#{phone},DATE_FORMAT(#{birth},'%Y-%m-%d'),#{createBy},SYSDATE(),#{updateBy},SYSDATE());")
    int addUser(UserEntity userEntity);

    int delUserById(String id);
}
