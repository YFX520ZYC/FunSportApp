package com.love.straction.dao;

import com.love.fun_entity.user.StrAction;
import com.love.fun_entity.user.StrVideo;
import com.love.fun_entity.user.StrVideoList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StrActionMapper {

    //加强训练按部位查询
    List<StrAction> selectStrActionList(Integer placeid);

    //点击加强训练大纲查看加强训练视屏列表
    List<StrVideoList> selectStrVideoListById(Integer actionid);

    //根据视频列表id得到具体视频
    List<StrVideo> selectStrVideoById(Integer strvideoid);

    //根据条件模糊查询自由训练大纲
    List<StrAction> selectStrActionLike(@Param("placeid") Integer placeid, @Param("timemin") Integer timemin, @Param("timemax") Integer timemax, @Param("level") String level);

}
