package org.accp.action.yl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.accp.pojo.Dept;
import org.accp.pojo.Persons;
import org.accp.pojo.Position;
import org.accp.service.yl.DeptService;
import org.accp.service.yl.PersonService;
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
@RequestMapping("/api/person")
public class PersonAction {
	
	@Autowired
	PersonService service;
	
	@Autowired
	DeptService dept;
	
	@Autowired
	PositionService position;
	
	
	@GetMapping("/page/{n}/{s}/{name}")
	public PageInfo<Persons> queryPage(@PathVariable Integer n,@PathVariable Integer s,@PathVariable String name){
		if(name == null || name.equals("null") || name.equals("")) {
			name = null;
		}
		return service.queryPage(n, s, name);
	}
	
	@DeleteMapping("/delById/{id}")
	public Map<String, Object> delById(@PathVariable Integer id){
		service.removeById(id);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", "200");
		return map;
	}
	@GetMapping("/loaddept")
	public List<Dept> loaddept(){
		List<Dept> list = dept.queryAll();
		return list;
	}
	
	@GetMapping("/loadposition")
	public List<Position> loadposition(){
		List<Position> list = position.getBaseMapper().selectList(null);
		return list;
	}
	
	@PostMapping("/insert")
	public Map<String, Object> insert(@RequestBody Persons p){
		p.setFedeintime(new Date());
		boolean isOk = service.save(p);
		
		Map<String, Object> map = new HashMap<String, Object>();
		if (isOk) 
			map.put("code", "200");
		else 
			map.put("code", "400");
		return map;
	}
	
	
	
	@PutMapping("/updateById/{id}")
	public Map<String, Object> updateById(@RequestBody Persons p){
		boolean isOk = service.updateById(p);
		Map<String, Object> map = new HashMap<String, Object>();
		if (isOk) 
			map.put("code", "200");
		else 
			map.put("code", "400");
		return map;
	}
	
}
