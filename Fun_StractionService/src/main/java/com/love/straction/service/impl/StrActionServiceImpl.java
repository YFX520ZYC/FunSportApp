package com.love.straction.service.impl;


import com.love.fun_common.utils.ResultUtil;
import com.love.fun_common.utils.ResultVo;
import com.love.straction.dao.StrActionMapper;
import com.love.straction.service.StrActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StrActionServiceImpl implements StrActionService {
    @Autowired
    private StrActionMapper strActionMapper;

    ////加强训练按部位查询
    @Override
    public ResultVo selectStrActionList(Integer placeid) {
        if (placeid != null) {
            return ResultUtil.execOk(strActionMapper.selectStrActionList(placeid));
        }else {
            return  ResultUtil.execERROR();
        }
    }

    //根据条件模糊查询自由训练大纲
    @Override
    public ResultVo selectStrActionLike(Integer placeid, Integer timemin, Integer timemax, String level) {
        return ResultUtil.execOk(strActionMapper.selectStrActionLike(placeid,timemin,timemax,level));
    }


    //点击加强训练大纲查看加强训练视屏列表
    @Override
    public ResultVo selectStrVideoListById(Integer actionid) {
        if (actionid != null){
            return ResultUtil.execOk(strActionMapper.selectStrVideoListById(actionid));
        }
        return ResultUtil.execERROR();
    }

    @Override
    public ResultVo selectStrVideoById(Integer strvideoid) {
        if (strvideoid != null){
            return ResultUtil.execOk(strActionMapper.selectStrVideoById(strvideoid));
        }
        return ResultUtil.execERROR();
    }


}
