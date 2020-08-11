package org.accp.action.tl;

import org.accp.service.tl.Impl.ProotImpl;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tl/proot") // 命名空间
public class ProotAction {
	
	@Autowired
	private ProotImpl impl;
	
	@PostMapping("updateByPpid/{ppid}")
	@ResponseBody
	public Integer updateByPpid(@RequestBody Integer [] rids, @PathVariable Integer ppid) {
		impl.deleteByPpid(ppid);
		if(rids.length>0) {
			impl.insertByList(rids, ppid);
		}
		return 1;
	}

}
