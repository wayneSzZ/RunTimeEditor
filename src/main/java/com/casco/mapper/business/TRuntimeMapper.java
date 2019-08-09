package com.casco.mapper.business;

import com.casco.pojo.TRuntime;
import com.casco.pojo.TRuntimeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TRuntimeMapper {
    long countByExample(TRuntimeExample example);

    int deleteByExample(TRuntimeExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(TRuntime record);

    int insertSelective(TRuntime record);

    List<TRuntime> selectByExample(TRuntimeExample example);

    TRuntime selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") TRuntime record, @Param("example") TRuntimeExample example);

    int updateByExample(@Param("record") TRuntime record, @Param("example") TRuntimeExample example);

    int updateByPrimaryKeySelective(TRuntime record);

    int updateByPrimaryKey(TRuntime record);
}