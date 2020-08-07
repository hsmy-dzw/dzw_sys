package org.accp;

import java.text.ParseException;
import java.util.concurrent.locks.Lock;

import org.accp.pojo.Jcb;
import org.accp.service.wc.JieCheBiao;
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
//	private JieCheBiao jcb1;
	private JieCheBiao jcb1;
	

}
