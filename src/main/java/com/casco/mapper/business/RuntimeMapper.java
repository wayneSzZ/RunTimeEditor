package com.casco.mapper.business;

import com.casco.pojo.Cruntime;
import com.casco.pojo.Entry;
import com.casco.pojo.Line;
import com.casco.pojo.Station;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

public interface RuntimeMapper {
   //@Insert("insert into t_runtime values(default,#{absNumber},#{direction},#{type},#{stopTime},#{startTime},#{runTime})")
    int insertRuntime(Cruntime cruntime);

    int insertListRuntime(List<Cruntime> list);

   @Delete("delete from t_runtime")
   int deleteRuntim();



    @Insert("insert into t_station values(#{stationId},#{consoleId},#{stationName},#{consoleName})")
    int insertStation(Station station);

    int insertListStaion(List<Station> list);

    @Delete("delete from t_station")
    int deleteStation();

    @Insert("insert into t_linedef values(#{absNumber},#{absName},#{ckFlag},#{fromSta},#{toSta},#{direction})")
    int insertLine(Line line);

    int insertListLine(List<Line> list);

    @Delete("delete from t_linedef")
    int deleteLine();


    @Insert("insert into t_entry values(default,#{stationId},#{stationEntry},#{absNumber},#{direction})")
    int insertEntry(Entry entry);

    int insertListEntry(List<Entry> list);

    @Delete("delete from t_entry")
    int deleteEntry();

}
