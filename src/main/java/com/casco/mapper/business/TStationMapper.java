package com.casco.mapper.business;

import com.casco.pojo.TStation;
import com.casco.pojo.TStationExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TStationMapper {
    long countByExample(TStationExample example);

    int deleteByExample(TStationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TStation record);

    int insertSelective(TStation record);

    int insertListStaion(List<TStation> list);

    List<TStation> selectByExample(TStationExample example);

    TStation selectByPrimaryKey(Integer id);

    @Select("select stationId  from t_station WHERE consoleId = #{consoleId}")
    List<Integer> selectByConsoleId(Integer consoleId);

    @Select("select stationId  from t_station WHERE consoleId = #{0} and stationId = #{1}")
    List<Integer> selectByConAndSta(Integer consoleId,Integer stationId);

    int updateByExampleSelective(@Param("record") TStation record, @Param("example") TStationExample example);

    int updateByExample(@Param("record") TStation record, @Param("example") TStationExample example);

    int updateByPrimaryKeySelective(TStation record);

    int updateByPrimaryKey(TStation record);
}