package org.accp;

import org.accp.service.yl.DeptService;
import org.accp.service.yl.PersonService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.accp.pojo.Jcb;
import org.accp.service.wc.JieCheBiao;
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
	
	@Test
	void contextLoads() throws ParseException {
//		service.queryAll();
//		jcb1.saveOne(new Jcb("111"));
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.parse(sdf.format(new Date())));
		
	}

}
