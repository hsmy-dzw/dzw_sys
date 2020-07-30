package org.accp.action.wc;

import java.util.HashMap;
import java.util.Map;

import org.accp.pojo.Jcb;
import org.accp.pojo.khb;
import org.accp.service.wc.JieCheBiao;
import org.accp.service.wc.kehucheliangbiao;
import org.springframework.beans.factory.annotation.Autowired;
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
		
		JieCheBiaoAction.save(pojo);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
}
