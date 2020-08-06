package org.accp.action.wh;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.accp.pojo.Clppb;
import org.accp.pojo.page;
import org.accp.service.wh.ClppbBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("api/clppd")
public class CppldAtion {
	@Autowired
	private ClppbBiz biz;
	
	
	@PostMapping("page")
	private PageInfo<Clppb> pageinfo(@RequestBody page page){
		System.out.println("进入了品牌分类");
		return biz.pageinfo(page);
	}
	
	@PostMapping("insert")
	public Map<String, Object> insert (@RequestBody Clppb cb){
		Map<String, Object> map = new HashMap<String, Object>();
		if(biz.insert(cb) ==0) {
			map.put("code", "500");
			map.put("msg", "出错了");
		}else {
			map.put("code", "200");
			map.put("data", cb);
			map.put("msg", "成功");
		}
		return map;
	}
	
	@PostMapping("delect/{pid2}")
	public Map<String, Object> delect (@PathVariable("pid2") Integer pid2){
		Map<String, Object> map = new HashMap<String, Object>();
		if(biz.delect(pid2) ==0) {
			map.put("code", "500");
			map.put("msg", "出错了");
		}else {
			map.put("code", "200");
			map.put("data", pid2);
			map.put("msg", "成功");
		}
		return map;
	}
	
	
	@GetMapping("showid/{id}")
	public Map<String, Object> select(@PathVariable("id") Integer id){
		Map<String, Object> map = new HashMap<String, Object>();
		int count =  biz.count(id);
		System.out.println("count是:"+count);
		if(count == 0) {
			map.put("code", "500");
			map.put("msg", "出错了");
		}else {
			map.put("code", "200");
			map.put("data", id);
			map.put("msg", "成功");
		}
		return map;
	}
	
	
	@GetMapping("showClppb/{id}")
	public Map<String, Object> cppselect(@PathVariable("id") Integer id){
		Map<String, Object> map = new HashMap<String, Object>();
		Clppb count =  biz.showcount(id);
		if("".equals(count.getPinname())) {
			map.put("code", "500");
			map.put("msg", "出错了");
		}else {
			map.put("code", "200");
			map.put("data", count);
			map.put("msg", "成功");
		}
		return map;
	}
	
	
	@PostMapping("update")
	public Map<String, Object> update(@RequestBody Clppb cb){
		Map<String, Object> map = new HashMap<String, Object>();
		if(biz.update(cb) ==0) {
			map.put("code", "500");
			map.put("msg", "出错了");
		}else {
			map.put("code", "200");
			map.put("data", cb);
			map.put("msg", "成功");
		}
		return map;
	}
	
	@GetMapping("clppbBrand")
	public Map<String, Object> lisf(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("data", biz.list());
		return map;
	}
	
	@GetMapping("querAll")
	public List<Clppb> querAll(){
		System.out.println("进入车牌查询");

		return 	biz.list();
	}
	
}
