package com.casco.mapper.business;

import com.casco.pojo.TAll;
import com.casco.pojo.TAllExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TAllMapper {
    long countByExample(TAllExample example);

    int deleteByExample(TAllExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TAll record);

    int insertSelective(TAll record);

    int insertListTall(List<TAll> list);

    List<TAll> selectByExample(TAllExample example);

    TAll selectByPrimaryKey(Long id);

    List<TAll> selectByStation(List<Integer> list);

    int updateByExampleSelective(@Param("record") TAll record, @Param("example") TAllExample example);

    int updateByExample(@Param("record") TAll record, @Param("example") TAllExample example);

    int updateByPrimaryKeySelective(TAll record);

    int updateByPrimaryKey(TAll record);
}