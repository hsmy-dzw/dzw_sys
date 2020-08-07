package org.accp.pojo;

public class Clxqb {
	private Integer mdweigth;
	private String mdbrand;
	private String mdname;
	private Integer mdmoney;
	
    public String getMdname() {
		return mdname;
	}

	public void setMdname(String mdname) {
		this.mdname = mdname;
	}

	public Integer getMdmoney() {
		return mdmoney;
	}

	public void setMdmoney(Integer mdmoney) {
		this.mdmoney = mdmoney;
	}

	private Integer clid;

    private String wid;

    public Integer getMdweigth() {
		return mdweigth;
	}

	public void setMdweigth(Integer mdweigth) {
		this.mdweigth = mdweigth;
	}

	public String getMdbrand() {
		return mdbrand;
	}

	public void setMdbrand(String mdbrand) {
		this.mdbrand = mdbrand;
	}

	private Integer mdid;

    private String clname;

    private String cljiage;

    public Integer getClid() {
        return clid;
    }

    public void setClid(Integer clid) {
        this.clid = clid;
    }

    public String getWid() {
        return wid;
    }

    public void setWid(String wid) {
        this.wid = wid == null ? null : wid.trim();
    }

    public Integer getMdid() {
        return mdid;
    }

    public void setMdid(Integer mdid) {
        this.mdid = mdid;
    }

    public String getClname() {
        return clname;
    }

    public void setClname(String clname) {
        this.clname = clname == null ? null : clname.trim();
    }

    public String getCljiage() {
        return cljiage;
    }

    public void setCljiage(String cljiage) {
        this.cljiage = cljiage == null ? null : cljiage.trim();
    }
}