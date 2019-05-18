package com.love.fun_serveruser.dao;

import com.love.fun_entity.user.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

public interface UserMapper {

    //通过手机号查询用户信息
    User selectByPhone(@Param(value = "phone") String phone);

    //新增用户
    int insert(User record);
    //看看用户是否已经存在。（省略）



}
