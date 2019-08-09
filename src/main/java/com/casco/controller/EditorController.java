package com.casco.controller;

import com.casco.common.OutputJson;
import com.casco.pojo.Request;
import com.casco.service.EditService;
import com.casco.service.InitConfig;
import com.casco.service.InsertConfig;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class EditorController   {

    @Autowired
    private InsertConfig insertConfig;
    @Autowired
    private InitConfig initConfig;
    @Autowired
    private EditService editService;

    @RequestMapping("edit")
    public String edit(){
        return "edit";
    }

    @RequestMapping("show")
    @ResponseBody
    public  OutputJson show(){
        System.out.println(editService.selectTAllbyPage());
        return editService.selectTAllbyPage();
    }

    @RequestMapping("console")
    @ResponseBody
    public  OutputJson console(){
        System.out.println(editService.getConsole());
        return editService.getConsole();
    }

    @RequestMapping(value="station", method= RequestMethod.POST)
    @ResponseBody
    public  OutputJson station(@RequestBody Request request) {

        System.out.println("EditorController.station" + request);
        System.out.println(editService.getSation(request.getConsoleId()));
        return editService.getSation(request.getConsoleId());
    }

    @RequestMapping(value="runtime", method= RequestMethod.POST)
    @ResponseBody
    public  OutputJson runtime(@RequestBody Request request) {

        System.out.println("EditorController.runtime++++++++++" + request);
        if (request.getStationId() == 0){
            return editService.getRuntime(request.getConsoleId());
        }else {
            return  editService.getRuntime(request.getConsoleId(),request.getStationId());
        }


    }

    @RequestMapping("*")
    public String All(){
        return "error/error";
    }


}
