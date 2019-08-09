package com.casco.mapper.business;

import com.casco.pojo.TLinedef;
import com.casco.pojo.TLinedefExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TLinedefMapper {
    long countByExample(TLinedefExample example);

    int deleteByExample(TLinedefExample example);

    int deleteByPrimaryKey(Integer absnumber);

    int insert(TLinedef record);

    int insertSelective(TLinedef record);

    List<TLinedef> selectByExample(TLinedefExample example);

    TLinedef selectByPrimaryKey(Integer absnumber);

    int updateByExampleSelective(@Param("record") TLinedef record, @Param("example") TLinedefExample example);

    int updateByExample(@Param("record") TLinedef record, @Param("example") TLinedefExample example);

    int updateByPrimaryKeySelective(TLinedef record);

    int updateByPrimaryKey(TLinedef record);
}