package com.love.fun_sportapi.service;


import com.love.fun_common.utils.ResultVo;
import com.love.fun_common.utils.SecurityUtils;import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "UserProvider",decode404 = true)
public interface UserService {
    @GetMapping("user/login.do")
    ResultVo selectByPhone(@RequestParam(value = "phone") String phone, @RequestParam(value = "password") String password);


    @PostMapping("user/useradd.do")
    ResultVo insert(@RequestParam(value = "phone")String phone ,@RequestParam(value = "password")String password) ;

    @GetMapping("user/userfind.do")
    ResultVo insert(@RequestParam(value = "phone")String phone );
}