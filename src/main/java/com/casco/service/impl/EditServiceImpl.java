package com.casco.service.impl;

import com.casco.common.OutputJson;
import com.casco.common.ReturnFormat;
import com.casco.mapper.business.TAllMapper;
import com.casco.mapper.business.TConsoleMapper;
import com.casco.mapper.business.TStationMapper;
import com.casco.pojo.TAll;
import com.casco.pojo.TAllExample;
import com.casco.pojo.TConsole;
import com.casco.pojo.TConsoleExample;
import com.casco.pojo.TStation;
import com.casco.pojo.TStationExample;
import com.casco.service.EditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditServiceImpl implements EditService {

    @Autowired
    private TAllMapper tAllMapper;
    @Autowired
    private TStationMapper tStationMapper;
    @Autowired
    private TConsoleMapper tConsoleMapper;
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
        System.out.println("EditServiceImpl.getRuntime+++++++++++++++++++++++++" + listStaId.size());
        System.out.println("EditServiceImpl.getRuntime+++++++++++++++++++++++++" + listStaId.get(0));
        List<TAll> list = tAllMapper.selectByStation(listStaId);


        return ReturnFormat.resultWithCount(0,list,list.size());
    }
}
