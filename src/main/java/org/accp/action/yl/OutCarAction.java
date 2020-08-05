package org.accp.action.yl;

import java.util.HashMap;
import java.util.Map;

import org.accp.pojo.OutCar;
import org.accp.service.yl.OutCarService;
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
@RequestMapping("/api/outcar")
public class OutCarAction {
	
	@Autowired
	OutCarService out;
	
	
	@GetMapping("/page/{p}/{s}")
	public PageInfo<OutCar> queryAll(@PathVariable Integer p,@PathVariable Integer s){
		return this.out.queryAll(p, s);
	}
	
	@DeleteMapping("/del/{id}")
	public Map<String, Object> del(@PathVariable Integer id){
//		this.out.del(id);
		this.out.removeById(id);
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("code", "200");
		return map;
	}
	
	@PostMapping("/add")
	public Map<String, Object> add(@RequestBody OutCar car){
		out.save(car);
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("code", "200");
		return map;
	}
	
	@GetMapping("/queryById/{id}")
	public OutCar queryById(@PathVariable Integer id) {
		return out.getById(id);
	}
	
	@PutMapping("/updateById")
	public Map<String, Object> updateById(@RequestBody OutCar car){
		boolean isUpdate = this.out.updateById(car);
		Map<String, Object> map = new HashMap<String,Object>();
		if (isUpdate) map.put("code", "200");
		else map.put("code", "300");
		return map;
	}
	
	
	
}
