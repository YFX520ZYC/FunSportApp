package com.love.fun_serveruser.controller;


import com.love.fun_common.utils.*;
import com.love.fun_entity.user.User;
import com.love.fun_serveruser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    //登录
    @GetMapping("user/login.do")
    public ResultVo selectByPhone(@RequestParam(value = "phone") String phone,@RequestParam(value = "password") String password){

        return userService.login(phone,SecurityUtils.encrypt(password));
    }


    //新增用户
    @PostMapping("user/useradd.do")
    ResultVo insert(@RequestParam(value = "phone")String phone ,@RequestParam(value = "password")String password) {

                User user = new User();
                user.setPhone(phone);
                user.setPassword(SecurityUtils.encrypt(password));
                user.setName("杨杨小妮子");
                user.setPhoto("https://cn.bing.com/th?id=OIP.yKa6RDcJkOofU__3CFzJ_gAAAA&pid=Api&rs=1&p=0");
                return userService.insert(user);
    }

    @GetMapping("user/userfind.do")
    ResultVo insert(@RequestParam(value = "phone")String phone ) {
          return ResultUtil.execOk(userService.findByPhone(phone));
    }



}
