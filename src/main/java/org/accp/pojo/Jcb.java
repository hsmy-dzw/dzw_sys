package org.accp.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@TableName("jcb")
@Data
@NoArgsConstructor  //无参
@AllArgsConstructor //全参
public class Jcb implements Serializable{
	public Jcb(String name) {
		this.jname = name;
	}
	
	private static final long serialVersionUID = 1L;
    private String id;
    
    private Integer oid;

    private Integer kid;

    private Integer cid;

    private String wid;

    private String jname;

    private String jmodel;

    private String jnumber;

    private String jliex;

    private Long gls;

    private Long cwjiage;

    private Long cnjiage;

    private String jb1;

    private String jb2;

    private String jb3;

    private String jb4;

    private Integer jb5;

    private Integer jb6;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getKid() {
        return kid;
    }

    public void setKid(Integer kid) {
        this.kid = kid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getWid() {
        return wid;
    }

    public void setWid(String wid) {
        this.wid = wid == null ? null : wid.trim();
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname == null ? null : jname.trim();
    }

    public String getJmodel() {
        return jmodel;
    }

    public void setJmodel(String jmodel) {
        this.jmodel = jmodel == null ? null : jmodel.trim();
    }

    public String getJnumber() {
        return jnumber;
    }

    public void setJnumber(String jnumber) {
        this.jnumber = jnumber == null ? null : jnumber.trim();
    }

    public String getJliex() {
        return jliex;
    }

    public void setJliex(String jliex) {
        this.jliex = jliex == null ? null : jliex.trim();
    }

    public Long getGls() {
        return gls;
    }

    public void setGls(Long gls) {
        this.gls = gls;
    }

    public Long getCwjiage() {
        return cwjiage;
    }

    public void setCwjiage(Long cwjiage) {
        this.cwjiage = cwjiage;
    }

    public Long getCnjiage() {
        return cnjiage;
    }

    public void setCnjiage(Long cnjiage) {
        this.cnjiage = cnjiage;
    }

    public String getJb1() {
        return jb1;
    }

    public void setJb1(String jb1) {
        this.jb1 = jb1 == null ? null : jb1.trim();
    }

    public String getJb2() {
        return jb2;
    }

    public void setJb2(String jb2) {
        this.jb2 = jb2 == null ? null : jb2.trim();
    }

    public String getJb3() {
        return jb3;
    }

    public void setJb3(String jb3) {
        this.jb3 = jb3 == null ? null : jb3.trim();
    }

    public String getJb4() {
        return jb4;
    }

    public void setJb4(String jb4) {
        this.jb4 = jb4 == null ? null : jb4.trim();
    }

    public Integer getJb5() {
        return jb5;
    }

    public void setJb5(Integer jb5) {
        this.jb5 = jb5;
    }

    public Integer getJb6() {
        return jb6;
    }

    public void setJb6(Integer jb6) {
        this.jb6 = jb6;
    }
}