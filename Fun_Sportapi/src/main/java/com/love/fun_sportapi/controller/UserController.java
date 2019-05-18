package com.love.fun_sportapi.controller;


import com.love.fun_common.utils.ResultVo;
import com.love.fun_sportapi.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "登录注册模块",tags = "用户登录注册")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("user/loginone.do")
    @ApiOperation(value = "登录操作",httpMethod = "GET",notes = "看看是否能登录")
    public ResultVo selectByOnePhone(@RequestParam(value = "phone") String phone,@RequestParam(value = "password") String password){
     return userService.selectByPhone(phone,password);
    }

    @PostMapping("user/add.do")
    @ApiOperation(value = "添加操作",httpMethod = "POST",notes = "能否注册成功")
    public ResultVo addUser(@RequestParam(value = "phone") String phone,@RequestParam(value = "password") String password){
        return userService.insert(phone,password);
    }

    @GetMapping("user/userfind.do")
    @ApiOperation(value = "根据电话号码查找操作",httpMethod = "GET",notes = "看是否已经存在")
    public ResultVo findUser(@RequestParam(value = "phone") @ApiParam(value = "phone") String phone){
        return userService.insert(phone);
    }



}
