package com.love.straction.controller;


import com.love.fun_common.utils.ResultVo;
import com.love.straction.service.StrActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class StrActionController {
    @Autowired
    private StrActionService strActionService;

    //查看大纲列表根据部位id
    @GetMapping("str/straction.do")
    ResultVo findstrActionByPlaceId(@RequestParam(value = "placeid") Integer placeid) {
        return strActionService.selectStrActionList(placeid);
    }


    //根据条件模糊查询自由训练大纲
    @PostMapping("str/stractionlike.do")
    ResultVo findstrActionByLike(@RequestParam(value = "placeid")Integer placeid,@RequestParam(value = "timemin")Integer timemin,@RequestParam(value = "timemax")Integer timemax,@RequestParam(value = "level")String level) {
        return strActionService.selectStrActionLike(placeid,timemin,timemax,level);
    }



    //根据大纲id查看视频列表
    @GetMapping("str/strvideolist.do")
    ResultVo findstrVideoListByPlaceId(@RequestParam(value = "actionid")Integer actionid) {
        return strActionService.selectStrVideoListById(actionid);
    }



    //根据视频列表的某个id获取具体的视频
    @GetMapping("str/strvideo.do")
    ResultVo findstrVideoById(@RequestParam(value = "strvideoid")Integer strvideoid) {
        return strActionService.selectStrVideoListById(strvideoid);
    }



}
