package com.casco.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class TRuntime implements Serializable {
    private Integer tid;

    private Integer absnumber;

    private Integer direction;

    private Integer type;

    private String stoptime;

    private String starttime;

    private String runtime;

    private static final long serialVersionUID = 1L;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getAbsnumber() {
        return absnumber;
    }

    public void setAbsnumber(Integer absnumber) {
        this.absnumber = absnumber;
    }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getStoptime() {
        return stoptime;
    }

    public void setStoptime(String stoptime) {
        this.stoptime = stoptime;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TRuntime other = (TRuntime) that;
        return (this.getTid() == null ? other.getTid() == null : this.getTid().equals(other.getTid()))
            && (this.getAbsnumber() == null ? other.getAbsnumber() == null : this.getAbsnumber().equals(other.getAbsnumber()))
            && (this.getDirection() == null ? other.getDirection() == null : this.getDirection().equals(other.getDirection()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getStoptime() == null ? other.getStoptime() == null : this.getStoptime().equals(other.getStoptime()))
            && (this.getStarttime() == null ? other.getStarttime() == null : this.getStarttime().equals(other.getStarttime()))
            && (this.getRuntime() == null ? other.getRuntime() == null : this.getRuntime().equals(other.getRuntime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTid() == null) ? 0 : getTid().hashCode());
        result = prime * result + ((getAbsnumber() == null) ? 0 : getAbsnumber().hashCode());
        result = prime * result + ((getDirection() == null) ? 0 : getDirection().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getStoptime() == null) ? 0 : getStoptime().hashCode());
        result = prime * result + ((getStarttime() == null) ? 0 : getStarttime().hashCode());
        result = prime * result + ((getRuntime() == null) ? 0 : getRuntime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tid=").append(tid);
        sb.append(", absnumber=").append(absnumber);
        sb.append(", direction=").append(direction);
        sb.append(", type=").append(type);
        sb.append(", stoptime=").append(stoptime);
        sb.append(", starttime=").append(starttime);
        sb.append(", runtime=").append(runtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}