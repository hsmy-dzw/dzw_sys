package org.accp.action.wc;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.accp.pojo.Wxb;
import org.accp.service.wc.WeiXiuBiao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
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
	//	PageInfo<Wxb> list= weixiubiaoAction.findPersonListByPage(p, s);
		System.out.println(JSON.toJSONString(weixiubiaoAction.findPersonListByPage(p, s).getList()));
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
	
	@GetMapping("updatewstates/{wstate}/{wid}/{jiefan}")
	public String updatewstates(@PathVariable String wstate, @PathVariable String wid, @PathVariable String jiefan) {
		System.out.println("进入状态修改！");
		
		weixiubiaoAction.querWeixiuxxBylxs(wstate, wid,jiefan);
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
	

	@GetMapping("getWxbByStatic/{pageNum}/{pageSize}")
	public PageInfo<Wxb> updatewstate(@PathVariable Integer pageNum, @PathVariable Integer pageSize) {
		System.out.println("进入查询待结算订单！");
		
		
		return weixiubiaoAction.queryWeixiuByStatic(pageNum, pageSize);
	}
	@GetMapping("updatestatcbyjungong/{wid}")
	public int updatestatcbyjungong( @PathVariable String wid) {
		System.out.println("进入返工修改！");
		
		return weixiubiaoAction.updatestatcbyjungong( wid);
	}
	
	
	
	@GetMapping("getNowM")
	public Float getNowM() {
		QueryWrapper<Wxb> qw = Wrappers.query();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		qw.eq("wjiedate",sdf.format(new Date()));
		qw.eq("wstate",100);
		qw.select("sum(wb2) total");
		return weixiubiaoAction.getOne(qw).getTotal();
	}
	
	@GetMapping("getNowJie")
	public Float getNowJie() {
		QueryWrapper<Wxb> qw = Wrappers.query();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		qw.eq("wkaidate",sdf.format(new Date()));
		qw.select("count(*) total");
		return weixiubiaoAction.getOne(qw).getTotal();
	}
	
	@GetMapping("getNowJ")
	public Float getNowJ() {
		QueryWrapper<Wxb> qw = Wrappers.query();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		qw.eq("wwandate",sdf.format(new Date()));
		qw.select("count(*) total");
		return weixiubiaoAction.getOne(qw).getTotal();
	}
	
	
	@GetMapping("getyue")
	public List<Float> get1() {
		List<Float> list = new ArrayList<Float>();
		for (int i = 1; i < 13; i++) {
			QueryWrapper<Wxb> qw = Wrappers.query();
			qw.eq("MONTH(wjiedate)",i);
			qw.eq("wstate",100);
			qw.select("sum(wb2) total");
			list.add(weixiubiaoAction.getOne(qw) != null?weixiubiaoAction.getOne(qw) .getTotal() : 0);
		}
		return list;
	}
	
}
