package org.accp.action.wc;

import java.util.HashMap;
import java.util.Map;

import org.accp.pojo.Clxqb;
import org.accp.pojo.khb;
import org.accp.pojo.khclb;
import org.accp.service.wc.Clxqbiao;
import org.accp.service.wc.JieCheBiao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/clxqb") // 命名空间
public class ClxqbAction {
	@Autowired
	private  Clxqbiao clxqAction;
	
	@PostMapping("person")
	public Map<String, Object> addPerson(@RequestBody Clxqb pojo) {
		
		clxqAction.modifyPerson(pojo);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	@GetMapping("{p}/{s}/{wid}")
	public PageInfo<Clxqb> queryPage(@PathVariable Integer p, @PathVariable Integer s,@PathVariable String wid) {
		System.out.println("进入维修材料！");
		
		return clxqAction.findPersonListByPage(p, s, wid);
	}
	
}
