package org.accp.pojo;

import java.util.Date;
import java.util.List;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;


@TableName("mercdis")
public class Mercdis {
	
	@TableField(exist=false)
	List<Mercdis> list;
    public List<Mercdis> getList() {
		return list;
	}

	public void setList(List<Mercdis> list) {
		this.list = list;
	}

	private Integer mdid;

    private String scoed;

    private String mdunit;

    private Long mdmoney;

    private String mdname;

    private Integer mdweigth;

    private String mdimgs;

    private Long mdmoney2;

    private Integer mdstatus;

    private String mdshop;

    private String mdcoding;

    private String mdbrand;

    private String mdtype;

    private Date mdate;

    public Integer getMdid() {
        return mdid;
    }

    public void setMdid(Integer mdid) {
        this.mdid = mdid;
    }

    public String getScoed() {
        return scoed;
    }

    public void setScoed(String scoed) {
        this.scoed = scoed == null ? null : scoed.trim();
    }

    public String getMdunit() {
        return mdunit;
    }

    public void setMdunit(String mdunit) {
        this.mdunit = mdunit == null ? null : mdunit.trim();
    }

    public Long getMdmoney() {
        return mdmoney;
    }

    public void setMdmoney(Long mdmoney) {
        this.mdmoney = mdmoney;
    }

    public String getMdname() {
        return mdname;
    }

    public void setMdname(String mdname) {
        this.mdname = mdname == null ? null : mdname.trim();
    }

    public Integer getMdweigth() {
        return mdweigth;
    }

    public void setMdweigth(Integer mdweigth) {
        this.mdweigth = mdweigth;
    }

    public String getMdimgs() {
        return mdimgs;
    }

    public void setMdimgs(String mdimgs) {
        this.mdimgs = mdimgs == null ? null : mdimgs.trim();
    }

    public Long getMdmoney2() {
        return mdmoney2;
    }

    public void setMdmoney2(Long mdmoney2) {
        this.mdmoney2 = mdmoney2;
    }

    public Integer getMdstatus() {
        return mdstatus;
    }

    public void setMdstatus(Integer mdstatus) {
        this.mdstatus = mdstatus;
    }

    public String getMdshop() {
        return mdshop;
    }

    public void setMdshop(String mdshop) {
        this.mdshop = mdshop == null ? null : mdshop.trim();
    }

    public String getMdcoding() {
        return mdcoding;
    }

    public void setMdcoding(String mdcoding) {
        this.mdcoding = mdcoding == null ? null : mdcoding.trim();
    }

    public String getMdbrand() {
        return mdbrand;
    }

    public void setMdbrand(String mdbrand) {
        this.mdbrand = mdbrand == null ? null : mdbrand.trim();
    }

    public String getMdtype() {
        return mdtype;
    }

    public void setMdtype(String mdtype) {
        this.mdtype = mdtype == null ? null : mdtype.trim();
    }

    public Date getMdate() {
        return mdate;
    }

    public void setMdate(Date mdate) {
        this.mdate = mdate;
    }
}