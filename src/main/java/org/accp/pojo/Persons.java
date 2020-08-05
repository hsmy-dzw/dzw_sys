package org.accp.pojo;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
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

    private Date brithday;

    private String pstatus;

    private String idcard;

    private Date pouttime;

    private String paddress;

    private String sosname;

    private String sosphone;

    private String email;

    private Integer isadmin;
    

	private String peptname;
	
	private String ppnamne;

}