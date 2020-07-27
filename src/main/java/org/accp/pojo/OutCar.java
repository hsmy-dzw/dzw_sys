package org.accp.pojo;

public class OutCar {
    private Integer oid;

    private Integer otid;

    private String onumber;

    private Integer ostatus;
    
    private String otname;
    
    private Float otprice;

    public String getOtname() {
		return otname;
	}

	public void setOtname(String otname) {
		this.otname = otname;
	}

	public Float getOtprice() {
		return otprice;
	}

	public void setOtprice(Float otprice) {
		this.otprice = otprice;
	}

	public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getOtid() {
        return otid;
    }

    public void setOtid(Integer otid) {
        this.otid = otid;
    }

    public String getOnumber() {
        return onumber;
    }

    public void setOnumber(String onumber) {
        this.onumber = onumber == null ? null : onumber.trim();
    }

    public Integer getOstatus() {
        return ostatus;
    }

    public void setOstatus(Integer ostatus) {
        this.ostatus = ostatus;
    }
}