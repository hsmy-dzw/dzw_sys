package org.accp.pojo;

import java.io.Serializable;
import java.util.Map;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("dept")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dept implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@TableId(type = IdType.AUTO,value = "peptid")
	private Integer peptid;

    private String peptname;
    
    private Integer pparentsid;
    
//    private Map<String, Object> depts;
}