package com.agony.usercenter.service;

import com.agony.usercenter.mapper.UserMapper;
import com.agony.usercenter.pojo.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

/**
 * @Author Agony
 * @Create 2023/11/18 21:07
 * @Version 1.0
 */
@SpringBootTest
class UserServiceTest {


    @Autowired
    private UserMapper userMapper;

    @Test
    void addTest() {

        User user = new User();
        user.setUserAccount("yupi");
        user.setAvatarUrl("");
        user.setGender(1);
        user.setUserPassword("12345678");
        user.setUserStatus(0);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        user.setPlanetCode("2");

        int insert = userMapper.insert(user);
        Assertions.assertEquals(1, insert);
        System.out.println(user.getId());

    }

}