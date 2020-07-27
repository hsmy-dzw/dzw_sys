package org.accp.pojo;

public class Fdjb {
    private Integer fdjid;

    private String fbname;

    private String fdjpp;
    private Integer pageSize;
    private Integer pageNum;
    private String name;
    
    
    public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getFdjid() {
        return fdjid;
    }

    public void setFdjid(Integer fdjid) {
        this.fdjid = fdjid;
    }

    public String getFbname() {
        return fbname;
    }

    public void setFbname(String fbname) {
        this.fbname = fbname == null ? null : fbname.trim();
    }

    public String getFdjpp() {
        return fdjpp;
    }

    public void setFdjpp(String fdjpp) {
        this.fdjpp = fdjpp == null ? null : fdjpp.trim();
    }

	@Override
	public String toString() {
		return "Fdjb [fdjid=" + fdjid + ", fbname=" + fbname + ", fdjpp=" + fdjpp + ", pageSize=" + pageSize
				+ ", pageNum=" + pageNum + ", name=" + name + "]";
	}

	
    
    
}