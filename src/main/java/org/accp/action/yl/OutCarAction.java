package org.accp.action.yl;

import org.accp.pojo.OutCar;
import org.accp.service.yl.OutCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	
	
}
