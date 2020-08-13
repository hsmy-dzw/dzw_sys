package org.accp.service.tl;

import org.accp.pojo.Position;

import com.github.pagehelper.PageInfo;

public interface PositionService {
	PageInfo<Position> queryAll(Integer pageNum,Integer pageSize);
	PageInfo<Position> queryAlls(Integer pageNum,Integer pageSize);
	Position queryById(Integer id);
}
