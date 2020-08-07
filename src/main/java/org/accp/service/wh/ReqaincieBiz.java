package org.accp.service.wh;

import java.util.List;

import org.accp.dao.wh.CxbMapper;
import org.accp.dao.wh.ReqaincieMapper;
import org.accp.pojo.Reqaincie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ReqaincieBiz {
	@Autowired
	private ReqaincieMapper reqaincieBiz;
	
	public List<Reqaincie> querAll(){
		return reqaincieBiz.querAll();
	}
}
