package com.love.straction.service;


import com.love.fun_common.utils.ResultVo;

public interface StrActionService {

    //加强训练按部位查询
    ResultVo selectStrActionList(Integer placeid);

    //根据条件模糊查询自由训练大纲
    ResultVo selectStrActionLike(Integer placeid, Integer timemin, Integer timemax, String level);

    //点击加强训练大纲查看加强训练视屏列表
    ResultVo selectStrVideoListById(Integer actionid);

    //根据视频列表id得到具体视频
    ResultVo selectStrVideoById(Integer strvideoid);
}
