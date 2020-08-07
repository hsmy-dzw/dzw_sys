package org.accp.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Reqaincie {
    private Integer rvid;

    private Integer msid;

    private String rvname;

    private BigDecimal rvmoney;

    private String rvpostscriopnot;

    private Date rvdate;

    private Integer rvstatus;

    public Integer getRvid() {
        return rvid;
    }

    public void setRvid(Integer rvid) {
        this.rvid = rvid;
    }

    public Integer getMsid() {
        return msid;
    }

    public void setMsid(Integer msid) {
        this.msid = msid;
    }

    public String getRvname() {
        return rvname;
    }

    public void setRvname(String rvname) {
        this.rvname = rvname == null ? null : rvname.trim();
    }

    public BigDecimal getRvmoney() {
        return rvmoney;
    }

    public void setRvmoney(BigDecimal rvmoney) {
        this.rvmoney = rvmoney;
    }

    public String getRvpostscriopnot() {
        return rvpostscriopnot;
    }

    public void setRvpostscriopnot(String rvpostscriopnot) {
        this.rvpostscriopnot = rvpostscriopnot == null ? null : rvpostscriopnot.trim();
    }

    public Date getRvdate() {
        return rvdate;
    }

    public void setRvdate(Date rvdate) {
        this.rvdate = rvdate;
    }

    public Integer getRvstatus() {
        return rvstatus;
    }

    public void setRvstatus(Integer rvstatus) {
        this.rvstatus = rvstatus;
    }
}