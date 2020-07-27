package org.accp.pojo;

public class OutCarType {
    private Integer otid;

    private String otname;

    private Float otprice;

    public Integer getOtid() {
        return otid;
    }

    public void setOtid(Integer otid) {
        this.otid = otid;
    }

    public String getOtname() {
        return otname;
    }

    public void setOtname(String otname) {
        this.otname = otname == null ? null : otname.trim();
    }

    public Float getOtprice() {
        return otprice;
    }

    public void setOtprice(Float otprice) {
        this.otprice = otprice;
    }
}