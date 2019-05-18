package com.love.fun_sportapi.controller;


import com.love.fun_common.utils.ResultVo;
import com.love.fun_sportapi.service.StractionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "自由训练模块",tags = "自有训练")
public class StractionController {

    @Autowired
    private StractionService stractionService;

    //查看大纲列表根据部位id
    @GetMapping("yy/straction.do")
    @ApiOperation(value = "自由训练-大纲",httpMethod = "GET",notes = "自由训练获取大纲列表")
    ResultVo findstrActionByPlaceIdOne(@RequestParam(value = "placeid") Integer placeid) {
        return stractionService.findstrActionByPlaceId(placeid);
    }

    //根据条件模糊查询自由训练大纲
    @PostMapping("yy/stractionlike.do")
    @ApiOperation(value = "自由训练-条件查询大纲",httpMethod = "POST",notes = "条件查询自有训练大纲；不限不传参，时间有最小到最大的区间：小于10分钟 0-10 大于30分钟 30-60；难度为写死，初级难度就穿字符串：初级")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "placeid", value = "要训练的部位id", paramType = "string", required = true),
            @ApiImplicitParam(name = "timemin", value = "训练时间的小值", paramType = "string", required = true),
            @ApiImplicitParam(name = "timemax", value = "训练时间的大值", paramType = "string", required = true),
            @ApiImplicitParam(name = "level", value = "要训练难度", paramType = "string", required = true),

    })
    ResultVo findstrActionByLikeTwo(@RequestParam(value = "placeid")Integer placeid,
                                    @RequestParam(value = "timemin")Integer timemin,
                                    @RequestParam(value = "timemax")Integer timemax,
                                    @RequestParam(value = "level")String level) {
        return stractionService.findstrActionByLike(placeid,timemin,timemax,level);
    }

    //根据大纲id查看视频列表
    @GetMapping("yy/strvideolist.do")
    @ApiOperation(value = "自由训练-视频列表",httpMethod = "GET",notes = "自由训练获取视频列表")
    ResultVo findstrVideoListByPlaceId(@RequestParam(value = "actionid") Integer actionid) {
        return stractionService.findstrVideoListByPlaceId(actionid);
    }


    //根据视频列表的某个id获取具体的视频
    @GetMapping("yy/strvideo.do")
    @ApiOperation(value = "自由训练-具体视频",httpMethod = "GET",notes = "根据自由训练获取到的视频列表中的某个视频id获取具体视频")
    ResultVo findstrVideoById(@RequestParam(value = "strvideoid") Integer strvideoid) {
        return stractionService.findstrVideoById(strvideoid);
    }


}
