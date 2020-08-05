package org.accp.action.wh;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.accp.pojo.Clppb;
import org.accp.pojo.Cxb;
import org.accp.pojo.page;
import org.accp.service.wh.CxbBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("api/cxb")
public class CxbAction {
	@Autowired
	private CxbBiz biz;
	
	@PostMapping("page")
	private PageInfo<Cxb> pageinfo(@RequestBody page page){
		System.out.println("进入了品牌分类2");
		return biz.cxbPageInfo(page);
	}
	

	@PostMapping("page2")
	private PageInfo<Cxb> pageinfo2(@RequestBody page page){
		System.out.println("进入了品牌分类3");
		return biz.cxbPageInfo2(page);
	}
	
	@PostMapping("insert")
	public Map<String, Object> insert (@RequestBody Cxb xb){
		Map<String, Object> map = new HashMap<String, Object>();
		if(biz.cxBInsert(xb) ==0) {
			map.put("code", "500");
			map.put("msg", "出错了");
		}else {
			map.put("code", "200");
			map.put("data", xb);
			map.put("msg", "成功");
		}
		return map;
	}
	
	@PostMapping("delect/{xid}")
	public Map<String, Object> delect (@PathVariable("xid") Integer xid){
		Map<String, Object> map = new HashMap<String, Object>();
		if(biz.cxBDelect(xid)==0) {
			map.put("code", "500");
			map.put("msg", "出错了");
		}else {
			map.put("code", "200");
			map.put("data", xid);
			map.put("msg", "成功");
		}
		return map;
	}
	
	
	@GetMapping("showid/{id}")
	public Map<String, Object> select(@PathVariable("id") Integer id){
		Map<String, Object> map = new HashMap<String, Object>();
		int count =  biz.cxbCount(id);
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
		Cxb count =  biz.cxbModel(id);
		if("".equals(count.getCxname())) {
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
	public Map<String, Object> update(@RequestBody Cxb cxb){
		Map<String, Object> map = new HashMap<String, Object>();
		if(biz.cxBUpdate(cxb) ==0) {
			map.put("code", "500");
			map.put("msg", "出错了");
		}else {
			map.put("code", "200");
			map.put("data", cxb);
			map.put("msg", "成功");
		}
		return map;
	}
	@GetMapping("querAllBypid2/{pid2}")
	public List<Cxb> querAllBypid2(@PathVariable Integer pid2){
		System.out.println("进入查询车辆类型");
		return biz.querAllBypid2(pid2);
	}
	
}
