package org.accp.pojo;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("supplier")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Supplier {
	private String scoed;
	private String sname;
	private Date sdate;
	private String saddress;
	private String sphone;
}