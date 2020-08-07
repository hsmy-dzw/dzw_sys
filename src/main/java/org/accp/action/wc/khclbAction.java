package org.accp.action.wc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.accp.pojo.khb;
import org.accp.pojo.khclb;
import org.accp.service.wc.kehubiao;
import org.accp.service.wc.kehucheliangbiao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONPObject;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/khclb") // 命名空间
public class khclbAction {
	@Autowired
	private  kehucheliangbiao kehucheliangbiaoaction;

	@GetMapping("{p}/{s}/{kid}")
	public PageInfo<khclb> queryPage(@PathVariable Integer p, @PathVariable Integer s,@PathVariable Integer kid) {
		System.out.println("进入客户车辆详情");
		return kehucheliangbiaoaction.findPersonListByPage(p, s, kid);
	}

	@GetMapping(value = "{p}/{s}/{kid}/jsonp")
	public JSONPObject getPersonListByPageToJSONP(@PathVariable Integer p, @PathVariable Integer s,@PathVariable Integer kid) throws Exception {
		// 跨域函数名称
		JSONPObject jsonp = new JSONPObject("callback");// 非常重要。对应jquery中jsonpCallback设置
		// 追加json数据
		// callback({})
		jsonp.addParameter(kehucheliangbiaoaction.findPersonListByPage(p, s,kid));
		return jsonp;
	}

	@GetMapping("person/{cid}")
	public khclb queryPersonById(@PathVariable Integer cid) {
		System.out.println("进入修改车辆详情");	
		khclb k = kehucheliangbiaoaction.getPersonById(cid);
		return k;
	}

	@DeleteMapping("person/{cid}")
	public Map<String, Object> deletePersonById(@PathVariable Integer cid) {
		System.out.println("进入删除车辆信息");
		kehucheliangbiaoaction.removePersonById(cid);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}

	@PutMapping("person")
	public Map<String, Object> updatePerson(@RequestBody khclb pojo) {
		kehucheliangbiaoaction.modifyPerson(pojo);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}


	@PostMapping("person")
	public Map<String, Object> addPerson(@RequestBody khclb pojo) {
		
		kehucheliangbiaoaction.addPerson(pojo);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	@GetMapping("person/cp")
	public List<String>  querCp(){
		System.out.println("进入车牌查询！");
		return kehucheliangbiaoaction.querByCp();
	}
	
	
	
}
