package com.love.fun_sportapi.service;

import com.love.fun_common.utils.ResultVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "StractionProvider")
public interface StractionService {

    //查看大纲列表根据部位id
    @GetMapping("str/straction.do")
    ResultVo findstrActionByPlaceId(@RequestParam(value = "placeid") Integer placeid) ;


    //根据条件模糊查询自由训练大纲
    @PostMapping("str/stractionlike.do")
    ResultVo findstrActionByLike(@RequestParam(value = "placeid")Integer placeid,@RequestParam(value = "timemin")Integer timemin,@RequestParam(value = "timemax")Integer timemax,@RequestParam(value = "level")String level) ;


    //根据大纲id查看视频列表
    @GetMapping("str/strvideolist.do")
    ResultVo findstrVideoListByPlaceId(@RequestParam(value = "actionid")Integer actionid) ;


    //根据视频列表的某个id获取具体的视频
    @GetMapping("str/strvideo.do")
    ResultVo findstrVideoById(@RequestParam(value = "strvideoid")Integer strvideoid);


}
