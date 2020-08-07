package org.accp.pojo;

public class Roots implements Comparable<Roots> {
    private Integer rid;

    private String rname;

    private Integer rlv;

    private String rboolean;
    
    private Roots root;

    public Roots getRoot() {
		return root;
	}

	public void setRoot(Roots roots) {
		this.root = roots;
	}

	public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    @Override
	public String toString() {
		return "Roots [rid=" + rid + ", rname=" + rname + ", rlv=" + rlv + ", rboolean=" + rboolean + ", root=" + root
				+ "]";
	}

	public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }

    public Integer getRlv() {
        return rlv;
    }

    public void setRlv(Integer rlv) {
        this.rlv = rlv;
    }

    public String getRboolean() {
        return rboolean;
    }

    public void setRboolean(String rboolean) {
        this.rboolean = rboolean;
    }

	@Override
	public int compareTo(Roots o) {
		// TODO Auto-generated method stub
		return this.getRid()-o.getRid();
	}
}