package org.accp.pojo;

public class Position {
    private Integer ppid;

    private Integer peptid;

    private String ppnamne;

    public Integer getPpid() {
        return ppid;
    }

    public void setPpid(Integer ppid) {
        this.ppid = ppid;
    }

    public Integer getPeptid() {
        return peptid;
    }

    public void setPeptid(Integer peptid) {
        this.peptid = peptid;
    }

    public String getPpnamne() {
        return ppnamne;
    }

    public void setPpnamne(String ppnamne) {
        this.ppnamne = ppnamne == null ? null : ppnamne.trim();
    }
}