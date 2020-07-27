package org.accp.pojo;

import java.util.Date;

public class SupplierAddress {
    private Integer said;

    private String scoed;

    private String saadderss;

    private Date sadate;

    public Integer getSaid() {
        return said;
    }

    public void setSaid(Integer said) {
        this.said = said;
    }

    public String getScoed() {
        return scoed;
    }

    public void setScoed(String scoed) {
        this.scoed = scoed == null ? null : scoed.trim();
    }

    public String getSaadderss() {
        return saadderss;
    }

    public void setSaadderss(String saadderss) {
        this.saadderss = saadderss == null ? null : saadderss.trim();
    }

    public Date getSadate() {
        return sadate;
    }

    public void setSadate(Date sadate) {
        this.sadate = sadate;
    }
}