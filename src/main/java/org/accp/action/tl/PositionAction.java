package org.accp.action.tl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.accp.pojo.Position;
import org.accp.pojo.Roots;
import org.accp.pojo.khb;
import org.accp.service.tl.PositionService;
import org.accp.service.tl.RootsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/tl/position") // 命名空间
public class PositionAction {
	@Autowired
	private PositionService service;

	@Autowired
	private RootsService rservice;

	@GetMapping("getAll/{p}/{s}")
	@ResponseBody
	public PageInfo<Position> getAll(@PathVariable Integer p, @PathVariable Integer s) {
		PageInfo<Position> page = service.queryAll(p, s);
		for (Position po : page.getList()) {
			System.out.println("进入角色权限查询");

			System.out.println("每个职位权限长度:" + po.getRoots().size());
			List tree = new ArrayList();
			Set<Roots> menuNames = new TreeSet<Roots>();// 剔除重复值，保存一级菜单名称

			for (Roots r : po.getRoots()) {
				if (null != r.getRoot()) {
					menuNames.add(r.getRoot());
				}
			}

			// 遍历一级菜单名称，生成二级菜单项
			for (Roots name : menuNames) {
				// 节点【初始化】
				Map<String, Object> node = new HashMap<String, Object>();
				node.put("id", name.getRid());// 0:根级菜单
				node.put("text", name.getRname());
				List nodeChild = new ArrayList();
				for (Roots rs : po.getRoots()) {
					// 匹配是否是当前菜单的子项
					if (null != rs.getRoot()) {
						if ((name.getRname()).equals(rs.getRoot().getRname())) {
							Map<String, Object> n = new HashMap<String, Object>();
							n.put("id", rs.getRid());
							n.put("text", rs.getRname());
							nodeChild.add(n);
						}
					}
				}
				node.put("children", nodeChild);
				tree.add(node);
			}
			po.setRoots(tree);
		}

		return page;
	}

	@GetMapping("getAllRoots")
	@ResponseBody
	public List<Roots> getAllRoots() {
		List<Roots> all = rservice.queryAll();

		List tree = new ArrayList();
		Set<Roots> menuNames = new TreeSet<Roots>();// 剔除重复值，保存一级菜单名称

		for (Roots r : all) {
			if (null != r.getRoot()) {
				menuNames.add(r.getRoot());
			}
		}

		// 遍历一级菜单名称，生成二级菜单项
		for (Roots name : menuNames) {
			// 节点【初始化】
			Map<String, Object> node = new HashMap<String, Object>();
			node.put("id", name.getRid());// 0:根级菜单
			node.put("text", name.getRname());
			List nodeChild = new ArrayList();
			for (Roots rs : all) {
				// 匹配是否是当前菜单的子项
				if (null != rs.getRoot()) {
					if ((name.getRname()).equals(rs.getRoot().getRname())) {
						Map<String, Object> n = new HashMap<String, Object>();
						n.put("id", rs.getRid());
						n.put("text", rs.getRname());
						nodeChild.add(n);
					}
				}
			}
			node.put("children", nodeChild);
			tree.add(node);
		}

		return tree;
	}
}
