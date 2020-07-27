package org.accp.pojo;

public class Roots {
    private Integer rid;

    private String rname;

    private Integer rlv;

    private Boolean rboolean;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }

    public Integer getRlv() {
        return rlv;
    }

    public void setRlv(Integer rlv) {
        this.rlv = rlv;
    }

    public Boolean getRboolean() {
        return rboolean;
    }

    public void setRboolean(Boolean rboolean) {
        this.rboolean = rboolean;
    }
}