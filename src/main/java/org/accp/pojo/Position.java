package org.accp.pojo;

import java.util.List;

public class Position {
    private Integer ppid;

    private Integer peptid;

    private String ppnamne;
    
    private List<Roots> roots;

    



	public List<Roots> getRoots() {
		return roots;
	}

	public void setRoots(List<Roots> roots) {
		this.roots = roots;
	}

	public Integer getPpid() {
        return ppid;
    }

    public void setPpid(Integer ppid) {
        this.ppid = ppid;
    }

    public Integer getPeptid() {
        return peptid;
    }

    public void setPeptid(Integer peptid) {
        this.peptid = peptid;
    }

    public String getPpnamne() {
        return ppnamne;
    }

    public void setPpnamne(String ppnamne) {
        this.ppnamne = ppnamne == null ? null : ppnamne.trim();
    }
}