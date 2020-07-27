package org.accp.pojo;

public class Clppb {
    private Integer pid2;

    private String pszm;

    private String pb1;

    private String pb2;

    private String pb3;

    private Integer pb4;

    private String pinname;

    public Integer getPid2() {
        return pid2;
    }

    public void setPid2(Integer pid2) {
        this.pid2 = pid2;
    }

    public String getPszm() {
        return pszm;
    }

    public void setPszm(String pszm) {
        this.pszm = pszm == null ? null : pszm.trim();
    }

    public String getPb1() {
        return pb1;
    }

    public void setPb1(String pb1) {
        this.pb1 = pb1 == null ? null : pb1.trim();
    }

    public String getPb2() {
        return pb2;
    }

    public void setPb2(String pb2) {
        this.pb2 = pb2 == null ? null : pb2.trim();
    }

    public String getPb3() {
        return pb3;
    }

    public void setPb3(String pb3) {
        this.pb3 = pb3 == null ? null : pb3.trim();
    }

    public Integer getPb4() {
        return pb4;
    }

    public void setPb4(Integer pb4) {
        this.pb4 = pb4;
    }

    public String getPinname() {
        return pinname;
    }

    public void setPinname(String pinname) {
        this.pinname = pinname == null ? null : pinname.trim();
    }
}