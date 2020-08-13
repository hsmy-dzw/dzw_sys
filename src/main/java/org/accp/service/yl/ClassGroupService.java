package org.accp.service.yl;

import org.accp.dao.yl.ClassGroupMapper;
import org.accp.pojo.ClassGroup;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ClassGroupService extends ServiceImpl<ClassGroupMapper, ClassGroup>{
	
	public PageInfo<ClassGroup> getGroup(Integer n, Integer s, String name) {
		// TODO Auto-generated method stub
		PageHelper.startPage(n,s);
		QueryWrapper<ClassGroup> qw = Wrappers.query();
		if(name != null) {
			qw.like("gname", name);
		}
		return new PageInfo<ClassGroup>(super.getBaseMapper().selectList(qw));
	}
}
