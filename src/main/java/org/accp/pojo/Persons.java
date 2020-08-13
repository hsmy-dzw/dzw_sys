package org.accp.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@TableName("persons")
@NoArgsConstructor
@AllArgsConstructor
public class Persons implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@TableId(type = IdType.AUTO,value = "pid")
	private Integer pid;

    private Integer ppid;

    private String pname;

    private String psex;

    private String account;

    private String pwd;
    
    private Date fedeintime;
    
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date brithday;

    private String pstatus;

    private String idcard;
    private Date pouttime;

    private String paddress;

    private String sosname;

    private String sosphone;

    private String email;

    private String isadmin;
    
    @TableField(exist =  false)
	private String peptname;
    @TableField(exist =  false)
	private String ppnamne;
    @TableField(exist =  false)
	private List<Communication> list;
    

}