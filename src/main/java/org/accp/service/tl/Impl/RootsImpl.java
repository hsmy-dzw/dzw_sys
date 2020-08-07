package org.accp.service.tl.Impl;

import java.util.List;

import org.accp.dao.tl.RootsMapper;
import org.accp.pojo.Roots;
import org.accp.service.tl.RootsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RootsImpl implements RootsService{

	@Autowired
	private RootsMapper mapper;
	
	@Override
	public List<Roots> queryAll() {
		// TODO Auto-generated method stub
		return mapper.queryAll();
	}

}
