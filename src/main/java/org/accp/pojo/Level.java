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
@TableName("level")
public class Level {
	
	@TableId(type = IdType.AUTO,value = "lid")
	private Integer lid;
	
	private String lname;
	
	private Float lprice;
	
}
