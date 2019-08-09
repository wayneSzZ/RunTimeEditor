package com.casco.service;

import com.casco.common.OutputJson;

public interface EditService {
    OutputJson selectTAllbyPage();
    OutputJson getConsole();
    OutputJson getSation(int consoleId);
    OutputJson getRuntime(int consoleId);
    OutputJson getRuntime(int consoleId,int stationId);

}
