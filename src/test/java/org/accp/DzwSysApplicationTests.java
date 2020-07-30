package org.accp;

import org.accp.pojo.Jcb;
import org.accp.service.wc.JieCheBiao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DzwSysApplicationTests {
	@Autowired
	private JieCheBiao jcb1;
	
	@Test
	void contextLoads() {
		jcb1.saveOne(new Jcb("111"));
	}

}
