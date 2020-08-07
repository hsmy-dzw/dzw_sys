package org.accp.pojo;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("cxb")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cxb {
    private Integer xid;

    private Integer pid2;

    private Integer fdjid;

    private String cxname;

    private String xb1;

    private String xb2;

    private String xb3;

    private Integer xb4;

    private Fdjb fdjb;
    
    private Clppb clppb;

	@Override
	public String toString() {
		return "Cxb [xid=" + xid + ", pid2=" + pid2 + ", fdjid=" + fdjid + ", cxname=" + cxname + ", xb1=" + xb1
				+ ", xb2=" + xb2 + ", xb3=" + xb3 + ", xb4=" + xb4 + ", fdjb=" + fdjb + ", clppb=" + clppb + "]";
	}
    
    
}