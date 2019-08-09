package com.casco.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class TLinedef implements Serializable {
    private Integer absnumber;

    private String absname;

    private Integer ckflag;

    private Integer fromsta;

    private Integer tosta;

    private Integer direction;

    private static final long serialVersionUID = 1L;

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

    public Integer getCkflag() {
        return ckflag;
    }

    public void setCkflag(Integer ckflag) {
        this.ckflag = ckflag;
    }

    public Integer getFromsta() {
        return fromsta;
    }

    public void setFromsta(Integer fromsta) {
        this.fromsta = fromsta;
    }

    public Integer getTosta() {
        return tosta;
    }

    public void setTosta(Integer tosta) {
        this.tosta = tosta;
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
        TLinedef other = (TLinedef) that;
        return (this.getAbsnumber() == null ? other.getAbsnumber() == null : this.getAbsnumber().equals(other.getAbsnumber()))
            && (this.getAbsname() == null ? other.getAbsname() == null : this.getAbsname().equals(other.getAbsname()))
            && (this.getCkflag() == null ? other.getCkflag() == null : this.getCkflag().equals(other.getCkflag()))
            && (this.getFromsta() == null ? other.getFromsta() == null : this.getFromsta().equals(other.getFromsta()))
            && (this.getTosta() == null ? other.getTosta() == null : this.getTosta().equals(other.getTosta()))
            && (this.getDirection() == null ? other.getDirection() == null : this.getDirection().equals(other.getDirection()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAbsnumber() == null) ? 0 : getAbsnumber().hashCode());
        result = prime * result + ((getAbsname() == null) ? 0 : getAbsname().hashCode());
        result = prime * result + ((getCkflag() == null) ? 0 : getCkflag().hashCode());
        result = prime * result + ((getFromsta() == null) ? 0 : getFromsta().hashCode());
        result = prime * result + ((getTosta() == null) ? 0 : getTosta().hashCode());
        result = prime * result + ((getDirection() == null) ? 0 : getDirection().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", absnumber=").append(absnumber);
        sb.append(", absname=").append(absname);
        sb.append(", ckflag=").append(ckflag);
        sb.append(", fromsta=").append(fromsta);
        sb.append(", tosta=").append(tosta);
        sb.append(", direction=").append(direction);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}