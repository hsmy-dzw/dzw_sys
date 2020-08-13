package org.accp.service.tl.Impl;

import org.accp.dao.tl.ProotMapper;
import org.accp.service.tl.ProotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProotImpl implements ProotService{
	
	@Autowired
	private ProotMapper mapper;

	@Override
	public int deleteByPpid(Integer ppid) {
		// TODO Auto-generated method stub
		return mapper.deleteByPpid(ppid);
	}

	@Override
	public int insertByList(Integer[] rids, Integer ppid) {
		// TODO Auto-generated method stub
		return mapper.insertByList(rids, ppid);
	}

}
