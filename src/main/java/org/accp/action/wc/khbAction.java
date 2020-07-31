package org.accp.action.wc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.accp.pojo.khb;
import org.accp.service.wc.kehubiao;
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
@RequestMapping("/api/khb") // 命名空间
public class khbAction {
	@Autowired
	private  kehubiao kehubiaos;

	@GetMapping("{p}/{s}")
	public PageInfo<khb> queryPage(@PathVariable Integer p, @PathVariable Integer s) {
		return kehubiaos.findPersonListByPage(p, s);
	}

	@GetMapping(value = "{p}/{s}/jsonp")
	public JSONPObject getPersonListByPageToJSONP(@PathVariable Integer p, @PathVariable Integer s) throws Exception {
		// 跨域函数名称
		JSONPObject jsonp = new JSONPObject("callback");// 非常重要。对应jquery中jsonpCallback设置
		// 追加json数据
		// callback({})
		jsonp.addParameter(kehubiaos.findPersonListByPage(p, s));
		return jsonp;
	}

	@GetMapping("person/{pid}")
	public khb queryPersonById(@PathVariable Integer pid) {
		khb k = kehubiaos.getPersonById(pid);
		return k;
	}

	@DeleteMapping("person/{pid}")
	public Map<String, Object> deletePersonById(@PathVariable Integer pid) {
		kehubiaos.removePersonById(pid);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}

	@PutMapping("person")
	public Map<String, Object> updatePerson(@RequestBody khb pojo) {
		kehubiaos.modifyPerson(pojo);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}


	@PostMapping("person")
	public Map<String, Object> addPerson(@RequestBody khb pojo) {
		
		kehubiaos.addPerson(pojo);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	@GetMapping("person/kehuxingxi/{piaohao}")
	public khb  querCp2(@PathVariable String piaohao){
		System.out.println("进入车牌查询1！");
		khb k = kehubiaos.querByChepiao(piaohao);
		
		return k;
	}
	@GetMapping("person/maxid")
	public String querCp2(){
		System.out.println("查询最大ID！");
		String id=kehubiaos.querMaxid();
		int idd =  Integer.parseInt(id);
		++idd;
		System.out.println(idd);
		String a =Integer.toString(idd) ;
		return a;
	}
	
}
