package com.love.fun_serveruser.service;

import com.love.fun_common.utils.ResultVo;
import com.love.fun_entity.user.User;

public interface UserService {

    //登录
    ResultVo login(String phone, String password);

    //新增用户
    ResultVo insert(User record);

    //通过手机号查询用户信息
    User findByPhone(String phone);

}
