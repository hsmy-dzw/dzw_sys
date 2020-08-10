package org.accp.service.wh;

import java.util.List;

import org.accp.dao.wh.SupplierMapper;
import org.accp.pojo.Supplier;
import org.accp.pojo.page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class SupplierBiz extends ServiceImpl<SupplierMapper, Supplier> {
	// 供应商

	public PageInfo<Supplier> pageInfo(page page) {
		PageHelper.startPage(page.getPageNum(), page.getPageSize());
		QueryWrapper<Supplier> qw = new QueryWrapper<Supplier>();
		if (!"".equals(page.getName()) && !page.getName().equals(null))
			qw.like("sname", page.getName());
		return new PageInfo<>(super.getBaseMapper().selectList(qw));
	}

	public int count(String code) {
		QueryWrapper<Supplier> qw = new QueryWrapper<Supplier>();
		qw.eq("scoed", code);
		return super.getBaseMapper().selectCount(qw);
	}
	public List<Supplier> list(){
		return super.getBaseMapper().selectList(null);
	}
	
	public Supplier lier(String code) {
		return super.getBaseMapper().selectByPrimaryKey(code);
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int insert(Supplier s) {
		return super.getBaseMapper().insert(s);
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int update(Supplier s) {
		QueryWrapper<Supplier> qw = new QueryWrapper<Supplier>();
		qw.eq("scoed", s.getScoed());
		return super.getBaseMapper().update(s, qw);
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int delect(String code) {
		QueryWrapper<Supplier> qw = new QueryWrapper<Supplier>();
		qw.eq("scoed", code);
		return super.getBaseMapper().delete(qw);
	}
}
