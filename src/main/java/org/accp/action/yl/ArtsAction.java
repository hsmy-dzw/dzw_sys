package org.accp.action.yl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.accp.pojo.Arts;
import org.accp.pojo.ClassGroup;
import org.accp.service.yl.ArtsService;
import org.accp.service.yl.ClassGroupService;
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
@RequestMapping("/api/arts")
public class ArtsAction {
	
	@Autowired
	ArtsService service;
	@Autowired
	ClassGroupService clas;
	
	@GetMapping("/queryAll/{n}/{s}/{name}")
	public PageInfo<Arts> queryAll(@PathVariable Integer n,@PathVariable Integer s,@PathVariable String name){
		if ("null".equals(name)) {
			name = null;
		}
		PageInfo<Arts> page = service.queryAll(n,s,name);
		
		return page;
	}
	
	@GetMapping("/getGroup/{n}/{s}/{name}")
	public PageInfo<ClassGroup> getGroup(@PathVariable Integer n,@PathVariable Integer s,@PathVariable String name){
		if ("null".equals(name)) {
			name = null;
		}
		return clas.getGroup(n,s,name);
	}
	
	@DeleteMapping("/delGroupById/{id}")
	public Map<String, Object> delGroupById(@PathVariable Integer id){
		boolean isOk = clas.removeById(id);
		Map<String, Object> map = new HashMap<String, Object>();
		if(isOk)
			map.put("code", 200);
		else 
			map.put("code", "400");
		return map;
	}
	
	@GetMapping("/loadAllArts")
	public List<Arts> loadAllArts(){
		return service.getBaseMapper().selectList(null);
	}
	
	@GetMapping("/getArtsById/{id}")
	public Arts getArtsById(@PathVariable Integer id) {
		return service.getById(id);
	}
	
	@GetMapping("/getGroupById/{id}")
	public ClassGroup getGroupById(@PathVariable Integer id) {
		return clas.getById(id);
	}
	
	@PutMapping("/updateByGroupId")
	public Map<String, Object> updateByGroupId(@RequestBody ClassGroup g){
		boolean isOk = clas.updateById(g);
		Map<String, Object> map = new HashMap<String, Object>();
		if(isOk)
			map.put("code", 200);
		else 
			map.put("code", "400");
		return map;
	}
	
	@PostMapping("/insertGroup")
	public Map<String, Object> insertGroup(@RequestBody ClassGroup g){
		boolean isOk = clas.save(g);
		Map<String, Object> map = new HashMap<String, Object>();
		if(isOk)
			map.put("code", 200);
		else 
			map.put("code", "400");
		return map;
	}
	
	@DeleteMapping("/delByArtsId/{id}")
	public Map<String, Object> delByArtsId(@PathVariable Integer id){
		boolean isOk = service.removeById(id);
		Map<String, Object> map = new HashMap<String, Object>();
		if(isOk)
			map.put("code", 200);
		else 
			map.put("code", "400");
		return map;
	}
	
	@PutMapping("/updateByArtsId")
	public Map<String, Object> updateByArtsId(@RequestBody Arts a){
		boolean isOk = service.updateById(a);
		Map<String, Object> map = new HashMap<String, Object>();
		if(isOk)
			map.put("code", 200);
		else 
			map.put("code", "400");
		return map;
	} 
	
	@PostMapping("/insertArts")
	public Map<String, Object> insertArts(@RequestBody Arts a){
		boolean isOk = service.save(a);
		Map<String, Object> map = new HashMap<String, Object>();
		if(isOk)
			map.put("code", 200);
		else 
			map.put("code", "400");
		return map;
	}
	
	@GetMapping("/loadAllGroup")
	public List<ClassGroup> loadGroup(){
		return clas.getBaseMapper().selectList(null);
	}
	
}
