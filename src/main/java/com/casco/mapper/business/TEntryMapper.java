package com.casco.mapper.business;

import com.casco.pojo.TEntry;
import com.casco.pojo.TEntryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface TEntryMapper {
    long countByExample(TEntryExample example);

    int deleteByExample(TEntryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TEntry record);

    int insertSelective(TEntry record);

    List<TEntry> selectByExample(TEntryExample example);

    TEntry selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TEntry record, @Param("example") TEntryExample example);

    int updateByExample(@Param("record") TEntry record, @Param("example") TEntryExample example);

    int updateByPrimaryKeySelective(TEntry record);

    int updateByPrimaryKey(TEntry record);
}