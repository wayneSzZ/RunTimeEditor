package com.casco.common;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * @ClassName OutputJson
 * @Description 统一返回json:返回客户端统一格式，包括状态码，提示信息，以及业务数据
 * @Author Yghh2415
 * @Date 2019/5/27
 */
public class OutputJson implements Serializable {
    private static final long serialVersionUID = 1L;

    //状态码
    private int code;

    //必要的提示信息
    private String msg;

    //业务数据
    private Object data;

    //数量
    private long count;

    public OutputJson(int code, String msg, Object data, long count) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.count = count;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public String toString() {
        if (null == this.data) {
            this.setData(new Object());
        }
        return JSON.toJSONString(this);
    }
}
