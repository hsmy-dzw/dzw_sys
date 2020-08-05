package org.accp.action.wc;

import java.util.HashMap;
import java.util.Map;

import org.accp.pojo.Wxb;
import org.accp.pojo.khb;
import org.accp.pojo.khclb;
import org.accp.service.wc.WeiXiuBiao;
import org.accp.service.wc.kehucheliangbiao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/wxb") // 命名空间
public class WeiXiuBiaoAction {
	@Autowired
	private  WeiXiuBiao weixiubiaoAction;
	@PostMapping("person")
	public Map<String, Object> addPerson(@RequestBody Wxb pojo) {
		
		weixiubiaoAction.addPerson(pojo);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	@GetMapping("{p}/{s}")
	public PageInfo<Wxb> queryPage(@PathVariable Integer p, @PathVariable Integer s) {
		System.out.println("进入客户车辆详情");
		return weixiubiaoAction.findPersonListByPage(p, s);
	}
	
	@GetMapping("person/{wid}")
	public Wxb queryPersonById(@PathVariable String wid) {
		System.out.println("进入修改车辆详情");	
		Wxb w = weixiubiaoAction.getPersonById(wid);
		return w;
	}
	@PutMapping("person")
	public Map<String, Object> updatePerson(@RequestBody Wxb w) {
		weixiubiaoAction.modifyPerson(w);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	@GetMapping("updatewstate/{wstate}/{wid}")
	public String updatewstate(@PathVariable String wstate, @PathVariable String wid) {
		System.out.println("进入状态修改！");
		
		weixiubiaoAction.updatewstate(wstate, wid);
		return "1";
	}
	@GetMapping("wancheng/{p}/{s}")
	public PageInfo<Wxb> queryPage2(@PathVariable Integer p, @PathVariable Integer s) {
		System.out.println("进入客户车辆详情1123123");
		return weixiubiaoAction.findPersonListByPage2(p, s);
	}
	@GetMapping("updatefg/{fglx}/{yy}/{wid}")
	public String updatefanggong(@PathVariable String fglx, @PathVariable String yy, @PathVariable String wid) {
		System.out.println("进入返工修改！");
		
		weixiubiaoAction.updatefglx(fglx, yy, wid);
		return "1";
	}
	
}
