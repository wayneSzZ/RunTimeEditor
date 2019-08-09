package com.casco.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class TEntry implements Serializable {
    private Integer id;

    private Integer stationid;

    private Integer stationentry;

    private Integer absnumber;

    private Integer direction;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStationid() {
        return stationid;
    }

    public void setStationid(Integer stationid) {
        this.stationid = stationid;
    }

    public Integer getStationentry() {
        return stationentry;
    }

    public void setStationentry(Integer stationentry) {
        this.stationentry = stationentry;
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
        TEntry other = (TEntry) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStationid() == null ? other.getStationid() == null : this.getStationid().equals(other.getStationid()))
            && (this.getStationentry() == null ? other.getStationentry() == null : this.getStationentry().equals(other.getStationentry()))
            && (this.getAbsnumber() == null ? other.getAbsnumber() == null : this.getAbsnumber().equals(other.getAbsnumber()))
            && (this.getDirection() == null ? other.getDirection() == null : this.getDirection().equals(other.getDirection()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStationid() == null) ? 0 : getStationid().hashCode());
        result = prime * result + ((getStationentry() == null) ? 0 : getStationentry().hashCode());
        result = prime * result + ((getAbsnumber() == null) ? 0 : getAbsnumber().hashCode());
        result = prime * result + ((getDirection() == null) ? 0 : getDirection().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", stationid=").append(stationid);
        sb.append(", stationentry=").append(stationentry);
        sb.append(", absnumber=").append(absnumber);
        sb.append(", direction=").append(direction);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}