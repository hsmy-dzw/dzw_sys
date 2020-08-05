package org.accp.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@TableName("position")
@NoArgsConstructor
@AllArgsConstructor
public class Position implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@TableId(type = IdType.AUTO,value = "ppid")
	private Integer ppid;

    private Integer peptid;

    private String ppnamne;

}