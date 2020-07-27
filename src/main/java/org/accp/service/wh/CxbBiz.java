package org.accp.service.wh;

import org.accp.dao.wh.CxbMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CxbBiz {
	
	@Autowired
	private CxbMapper pr;
	
}
