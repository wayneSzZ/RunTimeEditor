package com.casco.common;

import java.util.HashMap;
import java.util.Map;


public class ReturnFormat {
    private static Map<String,String> messageMap = new HashMap<String, String>();
    //初始化状态码与文字说明
    static {
        messageMap.put("0", "操作成功");
        messageMap.put("-1", "操作失败");

        messageMap.put("1000", "[服务器]运行时异常！");

        //业务异常定义
        messageMap.put("2000", "新增失败！");
        messageMap.put("2001", "更新失败！");
        messageMap.put("2002", "删除失败！");
        messageMap.put("2003", "查询失败！");
        messageMap.put("2004", "下载失败！");
        messageMap.put("2005", "上传失败！");

        messageMap.put("3000", "缺少参数或值为空！");
        messageMap.put("3001", "参数不合法！");
        messageMap.put("3002", "无操作权限！");
        messageMap.put("3003", "无效的Token！");
        messageMap.put("3004", "登录超时！");
        messageMap.put("3005", "自定义业务异常！");

        messageMap.put("4000", "查询结果为空！");


    }

    public static OutputJson result(int status) {
        OutputJson json = new OutputJson(status, messageMap.get(String.valueOf(status)), null,0);
        return json;
    }

    public static OutputJson resultWithData(int status, Object data) {
        OutputJson json = new OutputJson(status, messageMap.get(String.valueOf(status)), data,0);
        return json;
    }

    public static OutputJson resultWithCount(int status, Object data, long count) {
        OutputJson json = new OutputJson(status, messageMap.get(String.valueOf(status)), data,count);
        return json;
    }

    public static OutputJson resultWithMessage(int status, String message, Object data) {
        OutputJson json = new OutputJson(status, message, data,0);
        return json;
    }
}