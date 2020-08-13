package org.accp.pojo;

import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@TableName("reqaincie")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reqaincie {
    private Integer rvid;

    private Integer msid;

    private String rvname;

    private BigDecimal rvmoney;

    private String rvpostscriopnot;

    private Date rvdate;

    private Integer rvstatus;
    
    
    private MaintenService ce;
    
    private String cname;

	@Override
	public String toString() {
		return "Reqaincie [rvid=" + rvid + ", msid=" + msid + ", rvname=" + rvname + ", rvmoney=" + rvmoney
				+ ", rvpostscriopnot=" + rvpostscriopnot + ", rvdate=" + rvdate + ", rvstatus=" + rvstatus + ", ce="
				+ ce + ", cname=" + cname + "]";
	}
}