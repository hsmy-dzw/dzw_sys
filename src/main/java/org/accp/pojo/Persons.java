package org.accp.pojo;

import java.util.Date;

public class Persons {
    private Integer pid;

    private Integer ppid;

    private String pname;

    private String psex;

    private String account;

    private String pwd;

    private Date fedeintime;

    private Date brithday;

    private String pstatus;

    private String idcard;

    private Date pouttime;

    private String paddress;

    private String sosname;

    private String sosphone;

    private String email;

    private Integer isadmin;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getPpid() {
        return ppid;
    }

    public void setPpid(Integer ppid) {
        this.ppid = ppid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public String getPsex() {
        return psex;
    }

    public void setPsex(String psex) {
        this.psex = psex == null ? null : psex.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public Date getFedeintime() {
        return fedeintime;
    }

    public void setFedeintime(Date fedeintime) {
        this.fedeintime = fedeintime;
    }

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    public String getPstatus() {
        return pstatus;
    }

    public void setPstatus(String pstatus) {
        this.pstatus = pstatus == null ? null : pstatus.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public Date getPouttime() {
        return pouttime;
    }

    public void setPouttime(Date pouttime) {
        this.pouttime = pouttime;
    }

    public String getPaddress() {
        return paddress;
    }

    public void setPaddress(String paddress) {
        this.paddress = paddress == null ? null : paddress.trim();
    }

    public String getSosname() {
        return sosname;
    }

    public void setSosname(String sosname) {
        this.sosname = sosname == null ? null : sosname.trim();
    }

    public String getSosphone() {
        return sosphone;
    }

    public void setSosphone(String sosphone) {
        this.sosphone = sosphone == null ? null : sosphone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(Integer isadmin) {
        this.isadmin = isadmin;
    }
}