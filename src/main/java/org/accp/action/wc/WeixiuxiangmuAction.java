package org.accp.action.wc;

import java.util.HashMap;
import java.util.Map;

import org.accp.dao.wc.WxbMapper;
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
	
	@Autowired
	private  WxbMapper weixiubiao;
	
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
	@GetMapping("er/{p}/{s}/{wid}")
	public int queryPage2(@PathVariable Integer p, @PathVariable Integer s,@PathVariable String wid) {
		System.out.println("进入价格！");
		int jiag= weixiuxiangmuAction.findPersonListByPage2(p, s,wid);
		int jiag2= weixiuxiangmuAction.findPersonListByPage3(p, s,wid);
		String jiag3= weixiuxiangmuAction.findPersonListByPage4(p, s,wid);
		int j =0;
		int jiags=0;
		if(jiag3==null) {
			jiag3 = "0";
			j = Integer.parseInt(jiag3);
			jiags=jiag+jiag2+j;
		}else {
			j =Integer.parseInt(jiag3);
			jiags=jiag+jiag2+j;
		}
		
		
    weixiubiao.updatejiage(wid, jiags);
	System.out.println(jiag);
	System.out.println(jiag2);
	System.out.println(j);
		
		return jiags;
	}
	
}
