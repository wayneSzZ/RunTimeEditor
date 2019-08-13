package com.casco.service;

import com.casco.common.OutputJson;
import com.casco.pojo.TAll;

public interface EditService {
    OutputJson selectTAllbyPage();
    OutputJson getConsole();
    OutputJson getSation(int consoleId);
    OutputJson getRuntime(int consoleId);
    OutputJson getRuntime(int consoleId,int stationId);
    OutputJson updateRuntime(TAll tAll);
    OutputJson saveruntime();

}
