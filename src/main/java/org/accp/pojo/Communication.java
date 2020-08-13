package org.accp.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("communication")
public class Communication {
	
	@TableId(type = IdType.AUTO,value = "comid")
	private Integer comid;	
	
	private Integer staid;
	
	private String linkman;
	
	private String linkphone;
	
	private String email;
	
	private String relation;

}
