package org.accp.action.wh;

import java.util.HashMap;
import java.util.Map;

import org.accp.pojo.Clppb;
import org.accp.pojo.Mercdis;
import org.accp.pojo.page;
import org.accp.service.wh.MercdisBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("api/Mercdis")
public class MercdisAction {
	
	@Autowired
	private  MercdisBiz biz;
	
	@PostMapping("page")
	public PageInfo<Mercdis> pageinfo(@RequestBody page page){
		return biz.pageInfo(page);
	}
	

	
	@GetMapping("count/{id}")
	public Map<String, Object> count(@PathVariable("id") Integer id) {
		Map<String, Object> map = new HashMap<String, Object>();
		if (biz.count(id) == 0) {
			map.put("code", "500");
			map.put("mag", "不存在该用户");
		} else {
			map.put("code", "200");
			map.put("mag", "已存在该用户");
		}
		return map;
	}
	
	@GetMapping("countSupplier/{id}")
	public Map<String, Object> countSupplier(@PathVariable("id") String id) {
		Map<String, Object> map = new HashMap<String, Object>();
		if (biz.countSuplier(id) == 0) {
			map.put("code", "500");
			map.put("mag", "不存在该用户");
			map.put("data", id);
		} else {
			map.put("code", "200");
			map.put("mag", "已存在该用户");
		}
		return map;
	}
	
	
	
	@PostMapping("insert")
	public Map<String, Object> insert (@RequestBody Mercdis cb){
		Map<String, Object> map = new HashMap<String, Object>();
		if(biz.insert(cb) == 0) {
			map.put("code", "500");
			map.put("msg", "出错了");
		}else {
			map.put("code", "200");
			map.put("data", cb);
			map.put("msg", "成功");
		}
		return map;
	}
	
	@PostMapping("update2/{id}/{status}")
	public Map<String, Object> update2(@PathVariable("id") Integer id,@PathVariable("status") Integer status) {
		Map<String, Object> map = new HashMap<String, Object>();
		if (biz.updateStatus(id, status) == 0) {
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
	public Map<String, Object> update(@RequestBody Mercdis cb){
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
	
	
	@PostMapping("delete/{id}")
	public Map<String, Object> delete(@PathVariable("id") Integer cb){
		Map<String, Object> map = new HashMap<String, Object>();
		if(biz.delect(cb) ==0) {
			map.put("code", "500");
			map.put("msg", "出错了");
		}else {
			map.put("code", "200");
			map.put("data", cb);
			map.put("msg", "成功");
		}
		return map;
	}
	
	@GetMapping("showName/{id}")
	public Map<String, Object> cppselect(@PathVariable("id") Integer id){
		Map<String, Object> map = new HashMap<String, Object>();
		Mercdis count =  biz.showName(id);
		if("".equals(count.getMdname())) {
			map.put("code", "500");
			map.put("msg", "出错了");
		}else {
			map.put("code", "200");
			map.put("data", count);
			map.put("msg", "成功");
		}
		return map;
	}
	
	
}
