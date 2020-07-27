package org.accp.pojo;

import java.util.Date;

public class Supplier {
    private String scoed;

    private String sname;

    private Date sdate;

    public String getScoed() {
        return scoed;
    }

    public void setScoed(String scoed) {
        this.scoed = scoed == null ? null : scoed.trim();
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public Date getSdate() {
        return sdate;
    }

    public void setSdate(Date sdate) {
        this.sdate = sdate;
    }
}