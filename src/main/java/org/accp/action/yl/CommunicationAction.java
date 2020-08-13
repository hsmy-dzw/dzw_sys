package org.accp.action.yl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.accp.pojo.Communication;
import org.accp.service.yl.CommunicationService;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

@RequestMapping("/api/comm")
@RestController
public class CommunicationAction {
	
	@Autowired
	CommunicationService service;
	
	@DeleteMapping("/delById/{id}")
	public Map<String, Object> delById(@PathVariable Integer id){
		boolean isOk = service.removeById(id);
		Map<String, Object> map = new HashMap<String, Object>();
		if(isOk)
			map.put("code", "200");
		else 
			map.put("code", "300");
		return map;
	}
	
	@PutMapping("/updateById")
	public Map<String, Object> updateById(@RequestBody Communication comm){
		boolean isOk = service.updateById(comm);
		Map<String, Object> map = new HashMap<String, Object>();
		if(isOk)
			map.put("code", "200");
		else 
			map.put("code", "300");
		return map;
	}
	
	@PostMapping("/insert")
	public Map<String, Object> insert(@RequestBody List<Communication> comm){
		boolean isOk = service.saveBatch(comm);
		Map<String, Object> map = new HashMap<String, Object>();
		if(isOk)
			map.put("code", "200");
		else 
			map.put("code", "300");
		return map;
	}
	
	@GetMapping("/queryById/{id}")
	public Communication queryById(@PathVariable Integer id) {
		QueryWrapper<Communication> qw = Wrappers.query();
		qw.eq("comid", id);
		return service.getOne(qw);
	}
}
