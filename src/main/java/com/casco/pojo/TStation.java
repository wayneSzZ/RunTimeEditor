package com.casco.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class TStation implements Serializable {
    private Integer id;

    private Integer stationid;

    private Integer consoleid;

    private String staionname;

    private String consolename;

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

    public Integer getConsoleid() {
        return consoleid;
    }

    public void setConsoleid(Integer consoleid) {
        this.consoleid = consoleid;
    }

    public String getStaionname() {
        return staionname;
    }

    public void setStaionname(String staionname) {
        this.staionname = staionname;
    }

    public String getConsolename() {
        return consolename;
    }

    public void setConsolename(String consolename) {
        this.consolename = consolename;
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
        TStation other = (TStation) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStationid() == null ? other.getStationid() == null : this.getStationid().equals(other.getStationid()))
            && (this.getConsoleid() == null ? other.getConsoleid() == null : this.getConsoleid().equals(other.getConsoleid()))
            && (this.getStaionname() == null ? other.getStaionname() == null : this.getStaionname().equals(other.getStaionname()))
            && (this.getConsolename() == null ? other.getConsolename() == null : this.getConsolename().equals(other.getConsolename()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStationid() == null) ? 0 : getStationid().hashCode());
        result = prime * result + ((getConsoleid() == null) ? 0 : getConsoleid().hashCode());
        result = prime * result + ((getStaionname() == null) ? 0 : getStaionname().hashCode());
        result = prime * result + ((getConsolename() == null) ? 0 : getConsolename().hashCode());
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
        sb.append(", consoleid=").append(consoleid);
        sb.append(", staionname=").append(staionname);
        sb.append(", consolename=").append(consolename);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}