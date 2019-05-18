package com.love.fun_common.utils;




import java.util.List;

public class ResultUtil {
    public static ResultVo exec(int count, Object obj){
        ResultVo resultVo = new ResultVo();
        if (count > 0){
            resultVo.setCode(1);
            resultVo.setMsg("操作成功");
            resultVo.setData(obj);
        }else {
            resultVo.setCode(1001);
            resultVo.setMsg("操作失败");
        }
        return resultVo;
    }

    public static  ResultVo execOk(){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(1);
        resultVo.setMsg("OK");
        return resultVo;
    }
    public static  ResultVo execOk(Object obj){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(1);
        resultVo.setMsg("OK");
        resultVo.setData(obj);
        return resultVo;
    }

    public static  ResultVo execERROR(){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(0);
        resultVo.setMsg("ERROR");
        return resultVo;
    }
    public static  ResultVo execERROR(Object obj){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(0);
        resultVo.setMsg("ERROR");
        resultVo.setData(obj);
        return resultVo;
    }

    public static <T> PageVo<T> execPage(int page, int size, int count, List<T> data){
        PageVo<T> PageVo = new PageVo<>();
        PageVo.setData(data);
        PageVo.setCurrpage(page);
        PageVo.setSize(size);
        PageVo.setCount(count);
        return PageVo;
    }
}
