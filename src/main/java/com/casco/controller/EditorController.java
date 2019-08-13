package com.casco.controller;

import com.casco.aop.Log;
import com.casco.common.OutputJson;
import com.casco.pojo.Request;
import com.casco.pojo.TAll;
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

    @Log(title = "编辑界面",action = "响应编辑界面")
    @RequestMapping("/edit")
    public String edit(){
        return "edit";
    }



    @Log(title = "测试",action = "测试")
    @RequestMapping("/show")
    @ResponseBody
    public  OutputJson show(){
        System.out.println(editService.selectTAllbyPage());
        return editService.selectTAllbyPage();
    }
    @Log(title = "调度台",action = "初始化调度台列表")
    @RequestMapping("/console")
    @ResponseBody
    public  OutputJson console(){
        System.out.println(editService.getConsole());
        return editService.getConsole();
    }


    @RequestMapping(value="/station", method= RequestMethod.POST)
    @ResponseBody
    @Log(title = "车站",action = "根据调度台号刷新车站列表",consoleId = "#{request.consoleId}")
    public  OutputJson station(@RequestBody Request request) {

        System.out.println("EditorController.station" + request);

        return editService.getSation(Integer.parseInt(request.getConsoleId()));
    }

    @Log(title = "区间运行时分",action = "修改区间运行时分",consoleId = "#{tall.consoleId}",stationId = "#{tall.stationId}")
    @RequestMapping(value="/changeruntime", method= RequestMethod.POST)
    @ResponseBody
    public  OutputJson changeruntime(@RequestBody TAll tAll) {

        System.out.println("EditorController.changeruntime++++++++++" + tAll.getAbsnumber());
        System.out.println("EditorController.changeruntime++++++++++" + tAll.toString());

        return editService.updateRuntime(tAll);


    }

    @Log(title = "区间运行时分",action = "保存区间运行时分")
    @RequestMapping(value="/saveruntime", method= RequestMethod.POST)
    @ResponseBody
    public  OutputJson saveruntime() {



        return editService.saveruntime();


    }

    @Log(title = "区间运行时分",action = "根据台号或站号查询区间运行时分",consoleId = "#{request.consoleId}",stationId = "#{request.stationId}")
    @RequestMapping(value="runtime", method= RequestMethod.POST)
    @ResponseBody
    public  OutputJson runtime(@RequestBody Request request) {

        System.out.println("EditorController.runtime++++++++++" + request);
        if (request.getStationId() == 0){
            return editService.getRuntime(Integer.parseInt(request.getConsoleId()));
        }else {
            return  editService.getRuntime(Integer.parseInt(request.getConsoleId()),request.getStationId());
        }


    }

    @Log(title = "未知页面",action = "响应错误页面")
    @RequestMapping("*")
    public String All(){
        return "error/error";
    }


}
