package com.casco.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class TAll implements Serializable {
    private Long id;

    private Integer absnumber;

    private String absname;

    private Integer absdirection;

    private Integer fromstaid;

    private String fromstaname;

    private Integer inentry;

    private Integer tostaid;

    private String tostaname;

    private Integer outentry;

    private String stoptime;

    private String starttime;

    private String runtime;

    private Integer runtimedirection;

    private Integer traintype;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAbsnumber() {
        return absnumber;
    }

    public void setAbsnumber(Integer absnumber) {
        this.absnumber = absnumber;
    }

    public String getAbsname() {
        return absname;
    }

    public void setAbsname(String absname) {
        this.absname = absname;
    }

    public Integer getAbsdirection() {
        return absdirection;
    }

    public void setAbsdirection(Integer absdirection) {
        this.absdirection = absdirection;
    }

    public Integer getFromstaid() {
        return fromstaid;
    }

    public void setFromstaid(Integer fromstaid) {
        this.fromstaid = fromstaid;
    }

    public String getFromstaname() {
        return fromstaname;
    }

    public void setFromstaname(String fromstaname) {
        this.fromstaname = fromstaname;
    }

    public Integer getInentry() {
        return inentry;
    }

    public void setInentry(Integer inentry) {
        this.inentry = inentry;
    }

    public Integer getTostaid() {
        return tostaid;
    }

    public void setTostaid(Integer tostaid) {
        this.tostaid = tostaid;
    }

    public String getTostaname() {
        return tostaname;
    }

    public void setTostaname(String tostaname) {
        this.tostaname = tostaname;
    }

    public Integer getOutentry() {
        return outentry;
    }

    public void setOutentry(Integer outentry) {
        this.outentry = outentry;
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

    public Integer getRuntimedirection() {
        return runtimedirection;
    }

    public void setRuntimedirection(Integer runtimedirection) {
        this.runtimedirection = runtimedirection;
    }

    public Integer getTraintype() {
        return traintype;
    }

    public void setTraintype(Integer traintype) {
        this.traintype = traintype;
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
        TAll other = (TAll) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAbsnumber() == null ? other.getAbsnumber() == null : this.getAbsnumber().equals(other.getAbsnumber()))
            && (this.getAbsname() == null ? other.getAbsname() == null : this.getAbsname().equals(other.getAbsname()))
            && (this.getAbsdirection() == null ? other.getAbsdirection() == null : this.getAbsdirection().equals(other.getAbsdirection()))
            && (this.getFromstaid() == null ? other.getFromstaid() == null : this.getFromstaid().equals(other.getFromstaid()))
            && (this.getFromstaname() == null ? other.getFromstaname() == null : this.getFromstaname().equals(other.getFromstaname()))
            && (this.getInentry() == null ? other.getInentry() == null : this.getInentry().equals(other.getInentry()))
            && (this.getTostaid() == null ? other.getTostaid() == null : this.getTostaid().equals(other.getTostaid()))
            && (this.getTostaname() == null ? other.getTostaname() == null : this.getTostaname().equals(other.getTostaname()))
            && (this.getOutentry() == null ? other.getOutentry() == null : this.getOutentry().equals(other.getOutentry()))
            && (this.getStoptime() == null ? other.getStoptime() == null : this.getStoptime().equals(other.getStoptime()))
            && (this.getStarttime() == null ? other.getStarttime() == null : this.getStarttime().equals(other.getStarttime()))
            && (this.getRuntime() == null ? other.getRuntime() == null : this.getRuntime().equals(other.getRuntime()))
            && (this.getRuntimedirection() == null ? other.getRuntimedirection() == null : this.getRuntimedirection().equals(other.getRuntimedirection()))
            && (this.getTraintype() == null ? other.getTraintype() == null : this.getTraintype().equals(other.getTraintype()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAbsnumber() == null) ? 0 : getAbsnumber().hashCode());
        result = prime * result + ((getAbsname() == null) ? 0 : getAbsname().hashCode());
        result = prime * result + ((getAbsdirection() == null) ? 0 : getAbsdirection().hashCode());
        result = prime * result + ((getFromstaid() == null) ? 0 : getFromstaid().hashCode());
        result = prime * result + ((getFromstaname() == null) ? 0 : getFromstaname().hashCode());
        result = prime * result + ((getInentry() == null) ? 0 : getInentry().hashCode());
        result = prime * result + ((getTostaid() == null) ? 0 : getTostaid().hashCode());
        result = prime * result + ((getTostaname() == null) ? 0 : getTostaname().hashCode());
        result = prime * result + ((getOutentry() == null) ? 0 : getOutentry().hashCode());
        result = prime * result + ((getStoptime() == null) ? 0 : getStoptime().hashCode());
        result = prime * result + ((getStarttime() == null) ? 0 : getStarttime().hashCode());
        result = prime * result + ((getRuntime() == null) ? 0 : getRuntime().hashCode());
        result = prime * result + ((getRuntimedirection() == null) ? 0 : getRuntimedirection().hashCode());
        result = prime * result + ((getTraintype() == null) ? 0 : getTraintype().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", absnumber=").append(absnumber);
        sb.append(", absname=").append(absname);
        sb.append(", absdirection=").append(absdirection);
        sb.append(", fromstaid=").append(fromstaid);
        sb.append(", fromstaname=").append(fromstaname);
        sb.append(", inentry=").append(inentry);
        sb.append(", tostaid=").append(tostaid);
        sb.append(", tostaname=").append(tostaname);
        sb.append(", outentry=").append(outentry);
        sb.append(", stoptime=").append(stoptime);
        sb.append(", starttime=").append(starttime);
        sb.append(", runtime=").append(runtime);
        sb.append(", runtimedirection=").append(runtimedirection);
        sb.append(", traintype=").append(traintype);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}