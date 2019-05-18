package com.love.fun_common.utils;

import java.io.Serializable;
import java.util.List;

public class PageVo<T> implements Serializable {
    private int count;//总页数
    private int currpage;//当前页码
    private int size;//每页显示的行数
    private List<T> data;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCurrpage() {
        return currpage;
    }

    public void setCurrpage(int currpage) {
        this.currpage = currpage;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
