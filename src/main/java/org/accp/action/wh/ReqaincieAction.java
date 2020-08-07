package org.accp.action.wh;

import java.util.HashMap;
import java.util.Map;

import org.accp.pojo.MaintenService;
import org.accp.pojo.Reqaincie;
import org.accp.pojo.page;
import org.accp.service.wh.MaintenServiceBiz;
import org.accp.service.wh.reqaincieBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("api/Reqaincie")
public class ReqaincieAction {

	@Autowired
	private reqaincieBiz biz;

	@Autowired
	private MaintenServiceBiz biz2;

	@PostMapping("page")
	private PageInfo<Reqaincie> pageinfo(@RequestBody page page) {
		System.out.println("进入了品牌分类");
		return biz.pageinfo(page);
	}

	@GetMapping("count/{id}")
	public Map<String, Object> count(@PathVariable("id") Integer id) {
		Map<String, Object> map = new HashMap<String, Object>();
		if (biz.count(id) == 0) {
			map.put("code", "200");
			map.put("mag", "不存在该用户");
		} else {
			map.put("code", "500");
			map.put("mag", "已存在该用户");
		}
		return map;
	}

	@PostMapping("insert")
	public Map<String, Object> insert(@RequestBody Reqaincie cb) {
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println(cb);
		MaintenService gg = biz2.ce(cb.getCname());
		if (gg != null) {
			cb.setMsid(gg.getMsid());
		}
		if (biz.insert(cb) == 0) {
			map.put("code", "500");
			map.put("msg", "出错了");
		} else {
			map.put("code", "200");
			map.put("data", cb);
			map.put("msg", "成功");
			cb.setCname("");
		}
		return map;
	}
	
	@PostMapping("selectName/{pid2}")
	public Map<String, Object> seleAinc(@PathVariable("pid2") Integer pid2) {
		Map<String, Object> map = new HashMap<String, Object>();
		Reqaincie g = biz.aince(pid2);
		if (g.getRvname() =="") {
			map.put("code", "500");
			map.put("msg", "出错了");
		} else {
			map.put("code", "200");
			map.put("data",g);
			map.put("msg", "成功");
		}
		return map;
	}
	

	@PostMapping("delect/{pid2}")
	public Map<String, Object> delect(@PathVariable("pid2") Integer pid2) {
		Map<String, Object> map = new HashMap<String, Object>();
		if (biz.delect(pid2) == 0) {
			map.put("code", "500");
			map.put("msg", "出错了");
		} else {
			map.put("code", "200");
			map.put("data", pid2);
			map.put("msg", "成功");
		}
		return map;
	}
	
	@PostMapping("update2/{id}/{status}")
	public Map<String, Object> update2(@PathVariable("id") Integer id,@PathVariable("status") Integer status) {
		Map<String, Object> map = new HashMap<String, Object>();
		if (biz.update2(id, status) == 0) {
			map.put("code", "500");
			map.put("msg", "出错了");
		} else {
			map.put("code", "200");
			map.put("data", status);
			map.put("msg", "成功");
		}
		return map;
	}
	
	@PostMapping("update")
	public Map<String, Object> updateinsert(@RequestBody Reqaincie cb) {
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println(cb);
		MaintenService gg = biz2.ce(cb.getCname());
		if (gg != null) {
			cb.setMsid(gg.getMsid());
		}
		if (biz.update(cb) == 0) {
			map.put("code", "500");
			map.put("msg", "出错了");
		} else {
			map.put("code", "200");
			map.put("data", cb);
			map.put("msg", "成功");
			cb.setCname("");
		}
		return map;
	}

}
