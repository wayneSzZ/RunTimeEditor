package com.casco.pojo;

import java.util.Objects;

public class Line {
    private int absNumber;
    private String absName;
    private   int ckFlag;
    private  int fromSta;
    private  int toSta;
    private int direction;

    public Line() {
    }

    public Line(int absNumber, String absName, int ckFlag, int fromSta, int toSta, int direction) {
        this.absNumber = absNumber;
        this.absName = absName;
        this.ckFlag = ckFlag;
        this.fromSta = fromSta;
        this.toSta = toSta;
        this.direction = direction;
    }

    public int getAbsNumber() {
        return absNumber;
    }

    public void setAbsNumber(int absNumber) {
        this.absNumber = absNumber;
    }

    public String getAbsName() {
        return absName;
    }

    public void setAbsName(String absName) {
        this.absName = absName;
    }

    public int getCkFlag() {
        return ckFlag;
    }

    public void setCkFlag(int ckFlag) {
        this.ckFlag = ckFlag;
    }

    public int getFromSta() {
        return fromSta;
    }

    public void setFromSta(int fromSta) {
        this.fromSta = fromSta;
    }

    public int getToSta() {
        return toSta;
    }

    public void setToSta(int toSta) {
        this.toSta = toSta;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Line{" +
                "absNumber=" + absNumber +
                ", absName='" + absName + '\'' +
                ", ckFlag=" + ckFlag +
                ", fromSta=" + fromSta +
                ", toSta=" + toSta +
                ", direction=" + direction +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Line)) return false;
        Line line = (Line) o;
        return getAbsNumber() == line.getAbsNumber() &&
                getCkFlag() == line.getCkFlag() &&
                getFromSta() == line.getFromSta() &&
                getToSta() == line.getToSta() &&
                getDirection() == line.getDirection() &&
                Objects.equals(getAbsName(), line.getAbsName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAbsNumber(), getAbsName(), getCkFlag(), getFromSta(), getToSta(), getDirection());
    }
}
