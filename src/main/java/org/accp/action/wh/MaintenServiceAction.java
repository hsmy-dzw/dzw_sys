package org.accp.action.wh;

import java.util.HashMap;
import java.util.Map;

import org.accp.service.wh.MaintenServiceBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/maintenservice")
public class MaintenServiceAction {
	
	@Autowired
	private MaintenServiceBiz biz;
	
	@GetMapping("listMate")
	public Map<String, Object> list(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("data", biz.list());
		return map;
	}
	
	
}
