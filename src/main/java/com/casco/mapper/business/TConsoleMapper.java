package com.casco.mapper.business;

import com.casco.pojo.TConsole;
import com.casco.pojo.TConsoleExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TConsoleMapper {
    long countByExample(TConsoleExample example);

    int deleteByExample(TConsoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TConsole record);

    int insertSelective(TConsole record);

    int insertListConsole(List<TConsole> list);

    List<TConsole> selectByExample(TConsoleExample example);

    TConsole selectByPrimaryKey(Integer id);



    int updateByExampleSelective(@Param("record") TConsole record, @Param("example") TConsoleExample example);

    int updateByExample(@Param("record") TConsole record, @Param("example") TConsoleExample example);

    int updateByPrimaryKeySelective(TConsole record);

    int updateByPrimaryKey(TConsole record);
}