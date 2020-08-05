package org.accp.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("outcar")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OutCar implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@TableId(type = IdType.AUTO,value = "oid")
	private Integer oid;
	
	private String otname;

    private String onumber;

    private String ostatus;

    private Float oprice;
 


}