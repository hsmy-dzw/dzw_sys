package org.accp.action.yl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.accp.pojo.Dept;
import org.accp.pojo.Persons;
import org.accp.pojo.Position;
import org.accp.pojo.Roots;
import org.accp.service.yl.DeptService;
import org.accp.service.yl.PersonService;
import org.accp.service.yl.PositionService;

import org.accp.util.DateUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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
@RequestMapping("/api/person")
public class PersonAction {
	
	@Autowired
	PersonService service;
	
	@Autowired
	DeptService dept;
	
	@Autowired
	PositionService position;
	
	
	@GetMapping("/page/{n}/{s}/{name}")
	public PageInfo<Persons> queryPage(@PathVariable Integer n,@PathVariable Integer s,@PathVariable String name){
		if(name == null || name.equals("null") || name.equals("")) {
			name = null;
		}
		return service.queryPage(n, s, name);
	}
	
	@DeleteMapping("/delById/{id}")
	public Map<String, Object> delById(@PathVariable Integer id){
		service.removeById(id);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", "200");
		return map;
	}
	@GetMapping("/loaddept")
	public List<Dept> loaddept(){
		List<Dept> list = dept.queryAll();
		return list;
	}
	
	@GetMapping("/loadposition")
	public List<Position> loadposition(){
		List<Position> list = position.getBaseMapper().selectList(null);
		return list;
	}
	
	@PostMapping("/insert")
	public Map<String, Object> insert(@RequestBody Persons p){
		p.setFedeintime(new Date());
		boolean isOk = service.save(p);
		Map<String, Object> map = new HashMap<String, Object>();
		if (isOk) 
			map.put("code", "200");
		else 
			map.put("code", "400");
		return map;
	}
	
	@GetMapping("/queryById/{id}")
	public Persons queryById(@PathVariable Integer id) {
		return service.queryById(id);
	}
	
	
	
	@PutMapping("/updateById")
	public Map<String, Object> updateById(@RequestBody Persons p){
		boolean isOk = service.updateById(p);
		Map<String, Object> map = new HashMap<String, Object>();
		if (isOk) 
			map.put("code", "200");
		else 
			map.put("code", "400");
		return map;
	}
	
	
	@GetMapping("/lizhi/queryPage/{n}/{s}/{name}")
	public PageInfo<Persons> liziQueryPage(@PathVariable Integer n,@PathVariable Integer s,@PathVariable String name){
		if(name == null || name.equals("null") || name.equals("")) {
			name = null;
		}
		return service.liziQueryPage(n,s,name);
	}
	
	
	@PutMapping("/updatePersonStatus")
	public Map<String, Object> updatePersonStatus(@RequestBody Persons p){
		p.setPouttime(new Date());
		boolean isOk = service.updateById(p);
		Map<String, Object> map = new HashMap<String, Object>();
		if (isOk) 
			map.put("code", "200");
		else 
			map.put("code", "400");
		return map;
	}
	
	@GetMapping("/getAllComm/{n}/{s}/{name}")
	public PageInfo<Persons> queryAllComm(@PathVariable Integer n,@PathVariable Integer s,@PathVariable String name) {
		if(name == null || name.equals("null") || name.equals("")) {
			name = null;
		}
		return service.queryAllComm(n,s,name);
	}
	
	@GetMapping("/queryAll")
	public List<Persons> queryAll(){
		QueryWrapper<Persons> qw = Wrappers.query();
		qw.isNull("pouttime");
		qw.orderByDesc("fedeintime");
		return service.getBaseMapper().selectList(qw);
	}
	@GetMapping("loginIn/{name}/{pwd}")
	public Map<String, Object> loginIn(@PathVariable String name, @PathVariable String pwd) {
		Map<String, Object> message = new HashMap<String, Object>();
		//1.建立用户连接【单例】
		Subject subject=SecurityUtils.getSubject();
		try {
			//2.登录认证
			subject.login(new UsernamePasswordToken(name, pwd));
			System.out.println("2222222:"+SecurityUtils.getSubject().getSession().getId());
			Persons persons = (Persons)subject.getSession().getAttribute("Users");
			List tree = new ArrayList();
			Set<Roots> menuNames = new TreeSet<Roots>();// 剔除重复值，保存一级菜单名称
			for (Roots fun : persons.getPosition().getRoots()) {
				if(null !=  fun.getRoot()) {
					menuNames.add(fun.getRoot());
				}
			}
			// 遍历一级菜单名称，生成二级菜单项
			for (Roots names : menuNames) {
				// 节点【初始化】
				Map<String, Object> node = new HashMap<String, Object>();
				node.put("id", names.getRid());// 0:根级菜单
				node.put("text", names.getRname());
				List nodeChild = new ArrayList();
				for (Roots fun : persons.getPosition().getRoots()) {
					// 匹配是否是当前菜单的子项
					if(null != fun.getRoot()) {
						if (names.getRname().equals(fun.getRoot().getRname())) {
							Map<String, Object> n = new HashMap<String, Object>();
							n.put("id", fun.getRid());
							n.put("text", fun.getRname());
							nodeChild.add(n);
						}
					}
				}
				node.put("children", nodeChild);
				tree.add(node);
			}
			message.put("code", "200");
			message.put("msg", "ok");
			message.put("user",persons );
			message.put("tree",tree );
		} catch (UnknownAccountException e) {
			message.put("code", "301");
			message.put("msg", "用户名不存在");
		}catch (IncorrectCredentialsException e) {
			message.put("code", "302");
			message.put("msg", "密码错误");
		}
		return message;
	}
	
	@GetMapping("loginOut")
	public Map<String, Object> loginOut() throws Exception {
		Map<String, Object> message = new HashMap<String, Object>();
		Subject subject=SecurityUtils.getSubject();
		subject.logout();//登出
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}

	@GetMapping("getSessionUser")
	public Persons get() throws Exception {
		Persons persons = (Persons) SecurityUtils.getSubject().getSession().getAttribute("Users");
		return persons;
	}
	
//	@GetMapping("getFunTree")
//	public List getUserFunTree() {
//		// 从session获得用户，以便得到权限
//		Persons persons = (Persons) SecurityUtils.getSubject().getSession().getAttribute("Users");
//		List tree = new ArrayList();
//		Set<String> menuNames = new TreeSet<String>();// 剔除重复值，保存一级菜单名称
//		for (Roots fun : persons.getPosition().getRoots()) {
//			menuNames.add(fun.getRoot().getRname());
//		}
//		// 遍历一级菜单名称，生成二级菜单项
//		for (String name : menuNames) {
//			// 节点【初始化】
//			Map<String, Object> node = new HashMap<String, Object>();
//			node.put("id", 0);// 0:根级菜单
//			node.put("text", name);
//			List nodeChild = new ArrayList();
//			for (Roots fun : persons.getPosition().getRoots()) {
//				// 匹配是否是当前菜单的子项
//				if (name.equals(fun.getRoot().getRname())) {
//					Map<String, Object> n = new HashMap<String, Object>();
//					n.put("id", fun.getRid());
//					n.put("text", fun.getRname());
//					nodeChild.add(n);
//				}
//			}
//			node.put("children", nodeChild);
//			tree.add(node);
//		}
//		return tree;
//	}
	
}
