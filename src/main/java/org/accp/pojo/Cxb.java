package org.accp.pojo;

public class Cxb {
    private Integer xid;

    private Integer pid2;

    private Integer fdjid;

    private String cxname;

    private String xb1;

    private String xb2;

    private String xb3;

    private Integer xb4;

    public Integer getXid() {
        return xid;
    }

    public void setXid(Integer xid) {
        this.xid = xid;
    }

    public Integer getPid2() {
        return pid2;
    }

    public void setPid2(Integer pid2) {
        this.pid2 = pid2;
    }

    public Integer getFdjid() {
        return fdjid;
    }

    public void setFdjid(Integer fdjid) {
        this.fdjid = fdjid;
    }

    public String getCxname() {
        return cxname;
    }

    public void setCxname(String cxname) {
        this.cxname = cxname == null ? null : cxname.trim();
    }

    public String getXb1() {
        return xb1;
    }

    public void setXb1(String xb1) {
        this.xb1 = xb1 == null ? null : xb1.trim();
    }

    public String getXb2() {
        return xb2;
    }

    public void setXb2(String xb2) {
        this.xb2 = xb2 == null ? null : xb2.trim();
    }

    public String getXb3() {
        return xb3;
    }

    public void setXb3(String xb3) {
        this.xb3 = xb3 == null ? null : xb3.trim();
    }

    public Integer getXb4() {
        return xb4;
    }

    public void setXb4(Integer xb4) {
        this.xb4 = xb4;
    }
}