package com.agony.usercenter.service;

import com.agony.usercenter.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;
import jakarta.servlet.http.HttpServletRequest;

/**
 * @author 11971
 * @description 针对表【user(用户)】的数据库操作Service
 * @createDate 2023-11-18 21:07:06
 */
public interface UserService extends IService<User> {


    long register(String userAccount, String userPassword, String checkPassword, String planetCode);

    User login(String userAccount, String userPassword, HttpServletRequest httpServletRequest);

    User getSafetyUser(User user);

    int logout(HttpServletRequest request);
}
