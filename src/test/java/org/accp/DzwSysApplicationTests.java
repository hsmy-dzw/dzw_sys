   package org.accp;

import org.accp.service.yl.DeptService;
import org.accp.service.yl.PersonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DzwSysApplicationTests {
	@Autowired
	PersonService dept;
	
	@Autowired
	DeptService service;
	
	@Test
	void contextLoads() {
		service.queryAll();
	}

}
