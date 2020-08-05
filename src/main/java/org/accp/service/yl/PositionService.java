package org.accp.service.yl;

import org.accp.dao.tl.PositionMapper;
import org.accp.pojo.Position;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class PositionService extends ServiceImpl<PositionMapper, Position>{
	
	public PageInfo<Position> queryPage(Integer pageNum,Integer pageSize,String name){
		PageHelper.startPage(pageNum,pageSize);
		QueryWrapper<Position> wq = Wrappers.query();
		if (name != null) {
			wq.like("ppname", name);
		}
		return new PageInfo<Position>(super.getBaseMapper().selectList(wq));
	}
}
