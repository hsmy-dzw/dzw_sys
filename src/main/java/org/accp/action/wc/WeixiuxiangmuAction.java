package org.accp.action.wc;

import java.util.HashMap;
import java.util.Map;

import org.accp.pojo.Wxb;
import org.accp.pojo.Wxxmb;
import org.accp.service.wc.WeiXiuBiao;
import org.accp.service.wc.WeiXiuXianmubiao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/wxxm") // 命名空间
public class WeixiuxiangmuAction {
	@Autowired
	private  WeiXiuXianmubiao weixiuxiangmuAction;
	
	@PostMapping("person")
	public Map<String, Object> addPerson(@RequestBody Wxxmb pojo) {
		
		weixiuxiangmuAction.addPerson(pojo);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	@GetMapping("{p}/{s}/{wid}")
	public PageInfo<Wxxmb> queryPage(@PathVariable Integer p, @PathVariable Integer s,@PathVariable String wid) {
		System.out.println("进入维修详情");
		return weixiuxiangmuAction.findPersonListByPage(p, s,wid);
	}
}
