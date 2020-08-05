package org.accp.action.yl;

import org.accp.pojo.Position;
import org.accp.service.yl.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/position")
public class PositionAction {
	@Autowired
	PositionService sevice;
	
	@GetMapping("/page/{n}/{s}/{name}")
	public PageInfo<Position> queryPage(@PathVariable Integer n,@PathVariable Integer s,@PathVariable String name){
		if (name == null || "null".equals(name) || "".equals(name)) {
			name = null;
		}
		return sevice.queryPage(n, s, name);
	}
	
	
}
