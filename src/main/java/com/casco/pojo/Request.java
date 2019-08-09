package com.casco.pojo;

import java.util.Objects;

public class Request {
    private  int consoleId;
    private  int status;
    private int stationId;


    public Request() {
    }

    public int getConsoleId() {
        return consoleId;
    }

    public void setConsoleId(int consoleId) {
        this.consoleId = consoleId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStationId() {
        return stationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Request)) return false;
        Request request = (Request) o;
        return getConsoleId() == request.getConsoleId() &&
                getStatus() == request.getStatus() &&
                getStationId() == request.getStationId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getConsoleId(), getStatus(), getStationId());
    }

    @Override
    public String toString() {
        return "Request{" +
                "consoleId=" + consoleId +
                ", status=" + status +
                ", stationId=" + stationId +
                '}';
    }
}
