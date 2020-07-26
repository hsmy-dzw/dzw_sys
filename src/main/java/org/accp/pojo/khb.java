package org.accp.pojo;

import java.util.Date;

public class khb {
    private Integer kid;

    private Integer vid;

    private Integer id;

    private String kname;
    private  String hh;
		
	
    private String kphone;
    private Integer ksex;
    public Integer getKsex() {
		return ksex;
	}

	public void setKsex(Integer ksex) {
		this.ksex = ksex;
	}

	private String kaddres;

    private Date kbirthday;

    private String kremark;

    private String kb1;

    private String kb2;

    private String kb3;

    private String kb4;

    private Integer kb5;

    private Integer kb6;

    public Integer getKid() {
        return kid;
    }

    public void setKid(Integer kid) {
        this.kid = kid;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKname() {
        return kname;
    }

    public void setKname(String kname) {
        this.kname = kname == null ? null : kname.trim();
    }

    public String getKphone() {
        return kphone;
    }

    public void setKphone(String kphone) {
        this.kphone = kphone == null ? null : kphone.trim();
    }

    public String getKaddres() {
        return kaddres;
    }

    public void setKaddres(String kaddres) {
        this.kaddres = kaddres == null ? null : kaddres.trim();
    }

    public Date getKbirthday() {
        return kbirthday;
    }

    public void setKbirthday(Date kbirthday) {
        this.kbirthday = kbirthday;
    }

    public String getKremark() {
        return kremark;
    }

    public void setKremark(String kremark) {
        this.kremark = kremark == null ? null : kremark.trim();
    }

    public String getKb1() {
        return kb1;
    }

    public void setKb1(String kb1) {
        this.kb1 = kb1 == null ? null : kb1.trim();
    }

    public String getKb2() {
        return kb2;
    }

    public void setKb2(String kb2) {
        this.kb2 = kb2 == null ? null : kb2.trim();
    }

    public String getKb3() {
        return kb3;
    }

    public void setKb3(String kb3) {
        this.kb3 = kb3 == null ? null : kb3.trim();
    }

    public String getKb4() {
        return kb4;
    }

    public void setKb4(String kb4) {
        this.kb4 = kb4 == null ? null : kb4.trim();
    }

    public Integer getKb5() {
        return kb5;
    }

    public void setKb5(Integer kb5) {
        this.kb5 = kb5;
    }

    public Integer getKb6() {
        return kb6;
    }

    public void setKb6(Integer kb6) {
        this.kb6 = kb6;
    }
}