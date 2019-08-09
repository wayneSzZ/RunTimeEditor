package com.casco.pojo;

import java.util.Objects;

public class Cruntime {
    private int  absNumber;
    private  int direction;
    private  int type;
    private  String stopTime;
    private  String startTime;
    private  String runTime;

    public Cruntime() {
    }

    public Cruntime(int absNumber, int direction, int type, String stopTime, String startTime, String runTime) {
        this.absNumber = absNumber;
        this.direction = direction;
        this.type = type;
        this.stopTime = stopTime;
        this.startTime = startTime;
        this.runTime = runTime;
    }

    public int getAbsNumber() {
        return absNumber;
    }

    public void setAbsNumber(int absNumber) {
        this.absNumber = absNumber;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getRunTime() {
        return runTime;
    }

    public void setRunTime(String runTime) {
        this.runTime = runTime;
    }

    @Override
    public String toString() {
        return "Cruntime{" +
                "absNumber=" + absNumber +
                ", direction=" + direction +
                ", type=" + type +
                ", stopTime='" + stopTime + '\'' +
                ", startTime='" + startTime + '\'' +
                ", runTime='" + runTime + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cruntime)) return false;
        Cruntime cruntime = (Cruntime) o;
        return getAbsNumber() == cruntime.getAbsNumber() &&
                getDirection() == cruntime.getDirection() &&
                getType() == cruntime.getType() &&
                Objects.equals(getStopTime(), cruntime.getStopTime()) &&
                Objects.equals(getStartTime(), cruntime.getStartTime()) &&
                Objects.equals(getRunTime(), cruntime.getRunTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAbsNumber(), getDirection(), getType(), getStopTime(), getStartTime(), getRunTime());
    }
}
