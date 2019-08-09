package com.casco.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class TConsole implements Serializable {
    private Integer id;

    private Integer consoleid;

    private String consolename;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getConsoleid() {
        return consoleid;
    }

    public void setConsoleid(Integer consoleid) {
        this.consoleid = consoleid;
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
        TConsole other = (TConsole) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getConsoleid() == null ? other.getConsoleid() == null : this.getConsoleid().equals(other.getConsoleid()))
            && (this.getConsolename() == null ? other.getConsolename() == null : this.getConsolename().equals(other.getConsolename()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getConsoleid() == null) ? 0 : getConsoleid().hashCode());
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
        sb.append(", consoleid=").append(consoleid);
        sb.append(", consolename=").append(consolename);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}