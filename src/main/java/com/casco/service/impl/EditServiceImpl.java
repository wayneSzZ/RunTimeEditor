package com.casco.service.impl;

import com.casco.common.OutputJson;
import com.casco.common.ReturnFormat;
import com.casco.mapper.business.TAllMapper;
import com.casco.mapper.business.TConsoleMapper;
import com.casco.mapper.business.TStationMapper;
import com.casco.mode.Request;
import com.casco.pojo.*;
import com.casco.service.EditService;
import com.casco.service.InitConfig;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.List;

@Service
public class EditServiceImpl implements EditService {

    @Autowired
    private TAllMapper tAllMapper;
    @Autowired
    private TStationMapper tStationMapper;
    @Autowired
    private TConsoleMapper tConsoleMapper;
    @Autowired
    private InitConfig initConfigImpl;
    Logger logger = Logger.getLogger(EditServiceImpl.class);
    @Override
    public OutputJson selectTAllbyPage() {
        TAllExample tAllExample = new TAllExample();
        TAllExample.Criteria criteria = tAllExample.createCriteria();
        tAllExample.setDistinct(true);
        tAllExample.setOrderByClause("absNumber ASC");
        criteria.andAbsnumberBetween(101,102);
        List<TAll> tAlls = tAllMapper.selectByExample(tAllExample);

/*        String jsonStr = JSON.toJSONString(new OutputJson(1,"测试",tAlls,tAlls.size()));
        System.out.println(jsonStr);
        OutputJson outputJson = JSON.parseObject(jsonStr,OutputJson.class);
        System.out.println(outputJson.getData());
        String jsonstr1 = JSON.toJSONString(outputJson.getData());
        List<TAll> tAlls1 =JSON.parseArray(jsonstr1,TAll.class);
      for (TAll tAll : tAlls1 ) {
          System.out.println(tAll);
      }*/
        //JSON.toJavaObject(jsonStr,c)
        return ReturnFormat.resultWithCount(0,tAlls,tAlls.size());
    }

    @Override
    public OutputJson getConsole() {
        TConsoleExample tConsoleExample = new TConsoleExample();
        tConsoleExample.setDistinct(true);
        tConsoleExample.setOrderByClause("consoleId asc");
        List<TConsole> tConsoles =  tConsoleMapper.selectByExample(tConsoleExample);

        return ReturnFormat.resultWithCount(0,tConsoles,tConsoles.size());
    }

    @Override
    public OutputJson getSation(int consoleId) {
        TStationExample tStationExample = new TStationExample();
        TStationExample.Criteria criteria = tStationExample.createCriteria();
        tStationExample.setDistinct(true);
        tStationExample.setOrderByClause("stationId asc");
        criteria.andConsoleidEqualTo(consoleId);
        List<TStation> tStations = tStationMapper.selectByExample(tStationExample);
        return ReturnFormat.resultWithCount(0,tStations,tStations.size());
    }

    @Override
    public OutputJson getRuntime(int consoleId) {

        List<Integer> listStaId = tStationMapper.selectByConsoleId(consoleId);
        List<TAll> list = tAllMapper.selectByStation(listStaId);


        return ReturnFormat.resultWithCount(0,list,list.size());
    }

    @Override
    public OutputJson getRuntime(int consoleId, int stationId) {

        List<Integer> listStaId = tStationMapper.selectByConAndSta(consoleId,stationId);
        List<TAll> list = tAllMapper.selectByStation(listStaId);
        PageInfo<TAll> pageInfo = new PageInfo<TAll>(list);
        logger.info(">>>>>>>>>>>>>查询数目："+ pageInfo.getTotal());
        return ReturnFormat.resultWithCount(0,list,pageInfo.getTotal());
    }

    @Override
    public OutputJson getRuntime(Request request) {
        if (request.getPage() != 0 && request.getLimit()!=0){

            if (request.getStationId() == 0){
                List<Integer> listStaId = tStationMapper.selectByConsoleId(request.getConsoleId());
                PageHelper.startPage(request.getPage(), request.getLimit());
                List<TAll> list = tAllMapper.selectByStation(listStaId);
                PageInfo<TAll> pageInfo = new PageInfo<>(list);
                logger.info(">>>>>>>>>>>>>传入信息："+ request.toString());
                logger.info(">>>>>>>>>>>>>查询数目："+ pageInfo.getTotal());
                return ReturnFormat.resultWithCount(0,list,pageInfo.getTotal());
            }else {
                List<Integer> listStaId = tStationMapper.selectByConAndSta(request.getConsoleId(),request.getStationId());
                PageHelper.startPage(request.getPage(), request.getLimit());
                List<TAll> list = tAllMapper.selectByStation(listStaId);
                PageInfo<TAll> pageInfo = new PageInfo<>(list);
                logger.info(">>>>>>>>>>>>>传入信息："+ request.toString());
                logger.info(">>>>>>>>>>>>>查询数目："+ pageInfo.getTotal());
                return ReturnFormat.resultWithCount(0,list,pageInfo.getTotal());
            }


        }

        return null;
    }

    @Override
    public OutputJson updateRuntime(TAll tAll) {
        int line = tAllMapper.updataRuntime(tAll.getStoptime(),tAll.getStarttime(),tAll.getRuntime(),tAll.getAbsnumber(),tAll.getTraintype(),tAll.getRuntimedirection());

        if(line == 1){
            logger.info(">>>>>>>>>>>>>更新区间运行时分成功："+ tAll.toString());
            return ReturnFormat.result(0);
        }else {
            logger.info(">>>>>>>>>>>>>更新区间运行时分失败："+ tAll.toString());
            return  null;
        }

    }

    @Override
    public OutputJson insertRuntime(TAll tAll) {

        int line = tAllMapper.insert(tAll);
        if(line == 1){
            logger.info(">>>>>>>>>>>>>增加区间运行时分成功："+ tAll.toString());
            return ReturnFormat.result(0);
        }else {
            logger.info(">>>>>>>>>>>>>增加区间运行时分失败："+ tAll.toString());
            return  null;
        }

    }

    @Override
    public OutputJson delRuntime(TAll tAll) {
        TAllExample tAllExample = new TAllExample();
        TAllExample.Criteria criteria = tAllExample.createCriteria();
        criteria.andAbsnumberEqualTo(tAll.getAbsnumber());
        criteria.andTraintypeEqualTo(tAll.getTraintype());
        criteria.andRuntimedirectionEqualTo(tAll.getRuntimedirection());
        int len = tAllMapper.deleteByExample(tAllExample);
        if (len == 1){
            logger.info(">>>>>>>>>>>>>删除区间运行时分成功："+ tAll.toString());
            return ReturnFormat.result(0);
        }else {
            logger.info(">>>>>>>>>>>>>删除区间运行时分失败："+ tAll.toString());
            return ReturnFormat.result(1);
        }

    }

    @Override
    public OutputJson delsomeRuntime(List<TAll> tAlls) {
        int sum=0;
        for (TAll tAll : tAlls){
            TAllExample tAllExample = new TAllExample();
            TAllExample.Criteria criteria = tAllExample.createCriteria();
            criteria.andAbsnumberEqualTo(tAll.getAbsnumber());
            criteria.andTraintypeEqualTo(tAll.getTraintype());
            criteria.andRuntimedirectionEqualTo(tAll.getRuntimedirection());
            int len = tAllMapper.deleteByExample(tAllExample);
            tAllExample = null;
            sum=sum+len;
            logger.info(">>>>>>>>>>>>>批量删除区间运行时分第" + sum + "个" + "\t删除内容：" + tAll.toString());
        }
        if (sum == tAlls.size()){
            logger.info(">>>>>>>>>>>>>批量删除区间运行时分成功：");
            return ReturnFormat.result(0);
        }else {
            logger.info(">>>>>>>>>>>>>批量删除区间运行时分失败：");
            return ReturnFormat.result(1);
        }
    }

    @Override
    public OutputJson saveruntime() {
        String path = initConfigImpl.readPath();
        TAllExample tAllExample = new TAllExample();
        tAllExample.setOrderByClause("id ASC");
        List<TAll> tAlls = tAllMapper.selectByExample(tAllExample);
        StringBuffer sb = new StringBuffer("");
        sb.append("[ABS_TIME]");
        sb.append("\n");

        File file = new File(path + "data/run_time.txt");
        for (TAll tAll : tAlls){
            sb.append("ABS_NUMBER= "+tAll.getAbsnumber()+", DIRECTION= "+tAll.getRuntimedirection()+", TYPE= "+tAll.getTraintype()+", STOP_TIME="
            +tAll.getStoptime()+", START_TIME="+tAll.getStarttime()+", RUN_TIME="+tAll.getRuntime()+"\n");
        }
        sb.append("\n");
        sb.append("[ABS_TIME_END]");
        try {
            if(!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter =new FileWriter(file);

            fileWriter.write(sb.toString());
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }





        return ReturnFormat.result(0);
    }
}
