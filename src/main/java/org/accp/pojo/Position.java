package org.accp.pojo;

import java.io.Serializable;
import java.util.List;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@TableName("position")
@NoArgsConstructor
@AllArgsConstructor
public class Position implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@TableId(type = IdType.AUTO, value = "ppid")
	private Integer ppid;

	private Integer peptid;

	private String ppnamne;
	@TableField(exist = false)
	private List<Roots> roots;

	public Integer getPpid() {
		return ppid;
	}

	public void setPpid(Integer ppid) {
		this.ppid = ppid;
	}

	public Integer getPeptid() {
		return peptid;
	}

	public void setPeptid(Integer peptid) {
		this.peptid = peptid;
	}

	public String getPpnamne() {
		return ppnamne;
	}

	public void setPpnamne(String ppnamne) {
		this.ppnamne = ppnamne == null ? null : ppnamne.trim();
	}
}