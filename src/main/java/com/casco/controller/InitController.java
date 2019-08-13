package com.casco.controller;

import com.casco.aop.Log;
import com.casco.exception.OrderPeriodException;
import com.casco.service.InitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;


@Controller
public class InitController  {

    @Autowired
    private InitConfig initConfig;

    @PostConstruct
    @Log(title = "初始化数据库",action = "清空数据库数据重新加载")
    private void initconfig() throws  OrderPeriodException {
        Long starttime = System.currentTimeMillis();
        initConfig.readConfig();
        long endtime = System.currentTimeMillis();
        System.out.println("InitController.initconfig"+ (endtime-starttime));
    }


}
