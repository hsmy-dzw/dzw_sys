package org.accp.pojo;

public class Dept {
    private Integer peptid;

    private String peptname;

    public Integer getPeptid() {
        return peptid;
    }

    public void setPeptid(Integer peptid) {
        this.peptid = peptid;
    }

    public String getPeptname() {
        return peptname;
    }

    public void setPeptname(String peptname) {
        this.peptname = peptname == null ? null : peptname.trim();
    }
}