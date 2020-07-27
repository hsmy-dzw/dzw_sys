package org.accp.action.wh;

import java.util.HashMap;
import java.util.Map;

import org.accp.pojo.Fdjb;
import org.accp.service.wh.FjjbBiz;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("api/brand")
public class FdjbAction {
	
	@Autowired
	private FjjbBiz biz;
	
	@PostMapping("pagename")
	@ResponseBody
	public PageInfo<Fdjb> pageinfo(@RequestBody Fdjb fb){;
		return biz.pageinfo(fb);
	}
	
	@PostMapping("inser")
	//@ResponseBody
	public Map<String, Object> hh(@RequestBody Fdjb fb){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", biz.insert(fb) < 1 ?"500":"200");
		return map;
	}
	
	@PutMapping("updateNill")
	@ResponseBody
	public Map<String, Object> upda(@RequestBody Fdjb fb){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", biz.updateByPrimaryKeySelective(fb) < 1?"500":"200");
		return map;
	}
	
	
	@GetMapping("del/{id}")
	public Map<String, Object> del(@PathVariable("id") Integer id){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", id == 0 ?"500":"200");
		map.put("data", biz.deleteByPrimaryKey(id));
		return map;
	}
	
	@GetMapping("updashow/{id}")
	public Map<String, Object> show1(@PathVariable("id") Integer id){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", id == 0 ?"500":"200");
		map.put("data", biz.selectByPrimaryKey(id));
		return map;
	}
}
