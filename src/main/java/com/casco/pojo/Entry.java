package com.casco.pojo;

import java.util.Objects;

public class Entry {
    private int stationId;
    private int stationEntry;
    private int absNumber;
    private int  direction;

    public Entry() {
    }

    public Entry(int stationId, int stationEntry, int absNumber, int direction) {
        this.stationId = stationId;
        this.stationEntry = stationEntry;
        this.absNumber = absNumber;
        this.direction = direction;
    }

    public int getStationId() {
        return stationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public int getStationEntry() {
        return stationEntry;
    }

    public void setStationEntry(int stationEntry) {
        this.stationEntry = stationEntry;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entry)) return false;
        Entry entry = (Entry) o;
        return getStationId() == entry.getStationId() &&
                getStationEntry() == entry.getStationEntry() &&
                getAbsNumber() == entry.getAbsNumber() &&
                getDirection() == entry.getDirection();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStationId(), getStationEntry(), getAbsNumber(), getDirection());
    }

    @Override
    public String toString() {
        return "Entry{" +
                "stationId=" + stationId +
                ", stationEntry=" + stationEntry +
                ", absNumber=" + absNumber +
                ", direction=" + direction +
                '}';
    }
}
