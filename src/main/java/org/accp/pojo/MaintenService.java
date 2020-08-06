package org.accp.pojo;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;


@TableName("MaintenService")
public class MaintenService {
    private Integer msid;

    private String msname;

    private Date msdate;

    public Integer getMsid() {
        return msid;
    }

    public void setMsid(Integer msid) {
        this.msid = msid;
    }

    public String getMsname() {
        return msname;
    }

    public void setMsname(String msname) {
        this.msname = msname == null ? null : msname.trim();
    }

    public Date getMsdate() {
        return msdate;
    }

    public void setMsdate(Date msdate) {
        this.msdate = msdate;
    }

	@Override
	public String toString() {
		return "MaintenService [msid=" + msid + ", msname=" + msname + ", msdate=" + msdate + "]";
	}
    
    
	
}