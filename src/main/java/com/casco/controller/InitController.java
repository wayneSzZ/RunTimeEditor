package com.casco.controller;

import com.casco.service.InitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;


@Controller
public class InitController  {

    @Autowired
    private InitConfig initConfig;

    @PostConstruct
    private void initconfig(){
        Long starttime = System.currentTimeMillis();
        //initConfig.readConfig();
        long endtime = System.currentTimeMillis();
        System.out.println("InitController.initconfig"+ (endtime-starttime));
    }


}
