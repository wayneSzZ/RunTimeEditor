package com.casco.controller;

import com.alibaba.fastjson.JSON;
import com.casco.aop.Log;
import com.casco.common.OutputJson;
import com.casco.mode.Request;
import com.casco.pojo.TAll;
import com.casco.service.EditService;
import com.casco.service.InitConfig;
import com.casco.service.InsertConfig;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
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


    @Log(title = "编辑界面",action = "响应ly编辑界面")
    @RequestMapping("/lyedit")
    public String lyedit(){
        return "lyedit";
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

        return editService.getSation(request.getConsoleId());
    }

    @Log(title = "区间运行时分",action = "修改区间运行时分",consoleId = "#{tall.consoleId}",stationId = "#{tall.stationId}")
    @RequestMapping(value="/changeruntime", method= RequestMethod.POST)
    @ResponseBody
    public  OutputJson changeruntime(@RequestBody TAll tAll) {


        return editService.updateRuntime(tAll);
    }

    @Log(title = "区间运行时分",action = "增加区间运行时分",consoleId = "#{tall.consoleId}",stationId = "#{tall.stationId}")
    @RequestMapping(value="/insertRuntime", method= RequestMethod.POST)
    @ResponseBody
    public  OutputJson insertRuntime(@RequestBody TAll tAll) {
        System.out.println("EditorController.insertRuntime++++++++++++++++++++++++" + tAll.toString());
        return editService.insertRuntime(tAll);
    }

    @RequestMapping("/runtimeEdit")
    @Log(title = "区间运行时分",action = "修改区间运行时分",consoleId = "#{tall.consoleId}",stationId = "#{tall.stationId}")
    public String runtimeEdit()
    {
        return "runtimeEdit";
    }

    @RequestMapping("/addRuntime")
    @Log(title = "区间运行时分",action = "添加区间运行时分",consoleId = "#{tall.consoleId}",stationId = "#{tall.stationId}")
    public String addRuntime()
    {
        return "addRuntime";
    }


    @Log(title = "区间运行时分",action = "保存区间运行时分")
    @RequestMapping(value="/saveruntime", method= RequestMethod.POST)
    @ResponseBody
    public  OutputJson saveruntime() {

        return editService.saveruntime();


    }

    @Log(title = "区间运行时分",action = "根据台号或站号查询区间运行时分",consoleId = "#{request.consoleId}",stationId = "#{request.stationId}")
    @RequestMapping(value="/runtime", method= RequestMethod.POST)
    @ResponseBody
    public  OutputJson runtime(@RequestBody Request request) {


       /* if (request.getStationId() == 0){
            return editService.getRuntime(request.getConsoleId());
        }else {
            return  editService.getRuntime(request.getConsoleId(),request.getStationId());
        }*/
        return editService.getRuntime(request);

    }

    @Log(title = "区间运行时分",action = "删除指定区间运行时分")
    @RequestMapping(value="/runtime/del", method= RequestMethod.POST)
    @ResponseBody
    public  OutputJson delRuntime(@RequestBody TAll tAll) {


        return editService.delRuntime(tAll);

    }

    @Log(title = "区间运行时分",action = "删除部分区间运行时分")
    @RequestMapping(value="/runtime/delsome", method= RequestMethod.POST)
    @ResponseBody
    public  OutputJson delsomeRuntime(@RequestBody String str) {

        List<TAll> tAlls = JSON.parseArray(str,TAll.class);

        System.out.println("EditorController.delsomeRuntime+++++++++++++++++++" + tAlls.get(0).getAbsnumber());
        return editService.delsomeRuntime(tAlls);

    }

    @Log(title = "未知页面",action = "响应错误页面")
    @RequestMapping("*")
    public String All(){
        return "error/error";
    }


}
