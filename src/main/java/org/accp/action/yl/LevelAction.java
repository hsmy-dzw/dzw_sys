package org.accp.action.yl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.accp.pojo.Level;
import org.accp.service.yl.LevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/level")
public class LevelAction {	
	
	@Autowired
	LevelService service;
	
	@GetMapping("/page/{n}/{s}/{name}")
	public PageInfo<Level> page(@PathVariable Integer n,@PathVariable Integer s,@PathVariable String name){
		if(name == null || "".equals(name) || "null".equals(name)) {
			name = null;
		}
		return service.queryPage(n,s,name);
	}
	
	@DeleteMapping("/delById/{id}")
	public Map<String, Object> delById(@PathVariable Integer id){
		boolean isOk = service.removeById(id);
		Map<String, Object> map = new HashMap<String, Object>();
		if(isOk)
			map.put("code", "200");
		else 
			map.put("code", "400");
		return map;
	}
	
	@PutMapping("/updateById")
	public Map<String, Object> updateById(@RequestBody Level le){
		boolean isOk = service.updateById(le);
		Map<String, Object> map = new HashMap<String, Object>();
		if(isOk)
			map.put("code", "200");
		else 
			map.put("code", "400");
		return map;
	}
	
	@PostMapping("/insert")
	public Map<String, Object> insert(@RequestBody Level le){
		boolean isOk = service.save(le);
		Map<String, Object> map = new HashMap<String, Object>();
		if(isOk)
			map.put("code", "200");
		else 
			map.put("code", "400");
		return map;
	}
	
	@GetMapping("/queryById/{id}")
	public Level queryById(@PathVariable Integer id) {
		return service.getById(id);
	}
	
	@GetMapping("/loadAllLevel")
	public List<Level> loadAllLevel(){
		return service.getBaseMapper().selectList(null);
	}
	
	
}
