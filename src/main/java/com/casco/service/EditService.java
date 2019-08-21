package com.casco.service;

import com.casco.common.OutputJson;
import com.casco.mode.Request;
import com.casco.pojo.TAll;

import java.util.List;

public interface EditService {
    OutputJson selectTAllbyPage();
    OutputJson getConsole();
    OutputJson getSation(int consoleId);
    OutputJson getRuntime(int consoleId);
    OutputJson getRuntime(int consoleId,int stationId);
    OutputJson getRuntime(Request request);
    OutputJson updateRuntime(TAll tAll);
    OutputJson saveruntime();
    OutputJson delRuntime(TAll tAll);
    OutputJson delsomeRuntime(List<TAll> tAlls);
    OutputJson insertRuntime(TAll tAll);
}
