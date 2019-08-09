package com.casco.service.impl;

import com.casco.mapper.business.RuntimeMapper;
import com.casco.pojo.Cruntime;
import com.casco.service.InsertConfig;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class InsertConfigImpl implements InsertConfig {

    @Autowired
    private SqlSession sqlSession;

    @Resource
    private RuntimeMapper runtimeMapper;

    @Override
    public void insertRuntime() {
        Cruntime cruntime = new Cruntime(123456,1,2,"1.50","2.00","5.00");
        System.out.println(runtimeMapper);
         runtimeMapper.insertRuntime(cruntime);
    }



}
