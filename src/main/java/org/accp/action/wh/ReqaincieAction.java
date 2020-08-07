package org.accp.action.wh;

import java.util.List;

import org.accp.pojo.Clxqb;
import org.accp.pojo.Reqaincie;
import org.accp.service.wh.FjjbBiz;
import org.accp.service.wh.ReqaincieBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("api/reqaincie")
public class ReqaincieAction {
	@Autowired
	private ReqaincieBiz reqain;
	
	@GetMapping("querAll")
	public List<Reqaincie> queryPage() {
		System.out.println("维修项目查询！");
		return reqain.querAll();
	}
}
