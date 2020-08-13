package org.accp.pojo;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("arts")
public class Arts{
	@TableId(type = IdType.AUTO,value = "aid")
	private Integer aid;
	
	private Integer gid;
	@TableField(exist = false)
	private String gname;
	
	private Integer lid;
	
	@TableField(exist = false)
	private String lname;
	
	private String aname;
	
	private String asex;
	
	private String aphone;
	
	private String aaddress;
	
	private Date adate;
	
	private String acard;
	
}
