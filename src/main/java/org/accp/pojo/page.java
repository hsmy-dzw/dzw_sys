package org.accp.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class page {
	private Integer pageSize;
	private Integer pageNum;
	private String name;
	@Override
	public String toString() {
		return "page [pageSize=" + pageSize + ", pageNum=" + pageNum + ", name=" + name + "]";
	}
	
	
}
