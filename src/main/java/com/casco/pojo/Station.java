package com.casco.pojo;

import java.util.Objects;

public class Station {
    private int stationId;
    private int consoleId;
    private String stationName;
    private String consoleName;

    public Station() {
    }

    public Station(int stationId, int consoleId, String stationName, String consoleName) {
        this.stationId = stationId;
        this.consoleId = consoleId;
        this.stationName = stationName;
        this.consoleName = consoleName;
    }

    @Override
    public String toString() {
        return "Station{" +
                "stationId=" + stationId +
                ", consoleId=" + consoleId +
                ", stationName='" + stationName + '\'' +
                ", consoleName='" + consoleName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Station)) return false;
        Station station = (Station) o;
        return getStationId() == station.getStationId() &&
                getConsoleId() == station.getConsoleId() &&
                Objects.equals(getStationName(), station.getStationName()) &&
                Objects.equals(getConsoleName(), station.getConsoleName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStationId(), getConsoleId(), getStationName(), getConsoleName());
    }

    public int getStationId() {
        return stationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public int getConsoleId() {
        return consoleId;
    }

    public void setConsoleId(int consoleId) {
        this.consoleId = consoleId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getConsoleName() {
        return consoleName;
    }

    public void setConsoleName(String consoleName) {
        this.consoleName = consoleName;
    }
}
