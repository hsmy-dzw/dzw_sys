package org.accp.action.wc;

import java.util.HashMap;
import java.util.Map;

import org.accp.pojo.Jcb;
import org.accp.pojo.Wxb;
import org.accp.pojo.khb;
import org.accp.service.wc.JieCheBiao;
import org.accp.service.wc.kehucheliangbiao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jieche") // 命名空间
public class JieCheAction {
	@Autowired
	private  JieCheBiao JieCheBiaoAction;
	
	@PostMapping("person")
	public Map<String, Object> addPerson(@RequestBody Jcb pojo) {
		Wxb wxb  = new Wxb();
		wxb.setId(pojo.getId());
		wxb.setWstate("0");
		wxb.setWlicense(pojo.getJnumber());
		wxb.setWkname(pojo.getJname());
		wxb.setWpheno(pojo.getJb1());
		
		JieCheBiaoAction.save(pojo);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	@GetMapping("person/{id}")
	public Jcb queryPersonById(@PathVariable String id) {
		Jcb j= JieCheBiaoAction.selectByid(id);
		return j;
	}
}
