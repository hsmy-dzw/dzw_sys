package org.accp.action.wh;

import java.util.HashMap;
import java.util.Map;

import org.accp.pojo.Supplier;
import org.accp.pojo.page;
import org.accp.service.wh.SupplierBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("api/Supplier")
public class SupplierAction {
	
	@Autowired
	private SupplierBiz biz;
	
	@PostMapping("page")
	private PageInfo<Supplier> pageinfo(@RequestBody page page) {
		System.out.println("进入了品牌分类");
		return biz.pageInfo(page);
	}
	
	@GetMapping("count/{id}")
	public Map<String, Object> count(@PathVariable("id") String id) {
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
	public Map<String, Object> insert(@RequestBody Supplier cb) {
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println(cb);
		if (biz.insert(cb) == 0) {
			map.put("code", "500");
			map.put("msg", "出错了");
		} else {
			map.put("code", "200");
			map.put("data", cb);
			map.put("msg", "成功");
		}
		return map;
	}
	
	@PostMapping("update")
	public Map<String, Object> udpate(@RequestBody Supplier cb) {
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println(cb);
		if (biz.update(cb) == 0) {
			map.put("code", "500");
			map.put("msg", "出错了");
		} else {
			map.put("code", "200");
			map.put("data", cb);
			map.put("msg", "成功");
		}
		return map;
	}
	
	@GetMapping("selectName/{pid2}")
	public Map<String, Object> seleAinc(@PathVariable("pid2") String pid2) {
		Map<String, Object> map = new HashMap<String, Object>();
		Supplier g = biz.lier(pid2);
		if (g.getSname()=="") {
			map.put("code", "500");
			map.put("msg", "出错了");
		} else {
			map.put("code", "200");
			map.put("data",g);
			map.put("msg", "成功");
		}
		return map;
	}
	
	
	@GetMapping("list")
	public Map<String, Object> seleAinc() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code",200);
		map.put("data", biz.list());
		return map;
	}
	

	@PostMapping("delect/{pid2}")
	@ResponseBody
	public Map<String, Object> delect(@PathVariable("pid2") String pid2) {
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
	
	
}
