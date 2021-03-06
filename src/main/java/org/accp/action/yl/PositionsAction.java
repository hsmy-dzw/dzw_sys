package org.accp.action.yl;

import java.util.HashMap;
import java.util.Map;

import org.accp.pojo.Position;
import org.accp.service.yl.PositionService;
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
@RequestMapping("/api/position")
public class PositionsAction {
	@Autowired
	PositionService sevice;
	@GetMapping("/page/{n}/{s}/{name}")
	public PageInfo<Position> queryPage(@PathVariable Integer n,@PathVariable Integer s,@PathVariable String name){
		if (name == null || "null".equals(name) || "".equals(name)) {
			name = null;
		}
		return sevice.queryPage(n, s, name);
	}
	
	@DeleteMapping("/delById/{id}")
	public Map<String, Object> delById(@PathVariable Integer id){
		boolean isOk = sevice.removeById(id);
		Map<String, Object> map = new HashMap<String, Object>();
		if(isOk)
			map.put("code", "200");
		else 
			map.put("code", "300");
		return map;
	}
	
	@PostMapping("/insert")
	public Map<String, Object> insert(@RequestBody Position p){
		boolean isOk = sevice.save(p);
		Map<String, Object> map = new HashMap<String, Object>();
		if(isOk)
			map.put("code", "200");
		else 
			map.put("code", "300");
		return map;
	}
	
	@PutMapping("/updateById")
	public Map<String, Object> updateById(@RequestBody Position p){
		boolean isOk = sevice.updateById(p);
		Map<String, Object> map = new HashMap<String, Object>();
		if(isOk)
			map.put("code", "200");
		else 
			map.put("code", "300");
		return map;
	}
	
	@GetMapping("/queryById/{id}")
	public Position queryById(@PathVariable Integer id) {
		return sevice.getById(id);
	}
	
}
