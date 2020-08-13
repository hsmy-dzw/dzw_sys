package org.accp.service.tl.Impl;

import org.accp.dao.tl.PositionMapper;
import org.accp.pojo.Position;
import org.accp.pojo.khb;
import org.accp.service.tl.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class PositionImpl implements PositionService{
	
	@Autowired
	private PositionMapper mapper;

	@Override
	public PageInfo<Position> queryAll(Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Position>(mapper.queryAll());
	}

	@Override
	public Position queryById(Integer id) {
		// TODO Auto-generated method stub
		return mapper.queryById(id);
	}

	@Override
	public PageInfo<Position> queryAlls(Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Position>(mapper.queryAlls());
	}
}
