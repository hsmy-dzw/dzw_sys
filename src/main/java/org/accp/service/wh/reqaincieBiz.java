package org.accp.service.wh;

import org.accp.dao.wh.ReqaincieMapper;
import org.accp.pojo.Reqaincie;
import org.accp.pojo.page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS,isolation = Isolation.READ_COMMITTED,readOnly = true)
public class reqaincieBiz extends ServiceImpl<ReqaincieMapper, Reqaincie>{
	//维修项目
	@Autowired
	private  ReqaincieMapper pr;
	
	public int count (Integer id) {
		return super.getBaseMapper().countID(id);
	}
	
	public PageInfo<Reqaincie> pageinfo(page page){
		PageHelper.startPage(page.getPageNum(), page.getPageSize());
		return new PageInfo<>(super.getBaseMapper().pageinfo(page));
	}
	
	public Reqaincie aince(Integer id ) {
		return super.getBaseMapper().selectByPrimaryKey2(id);
	}
	
	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED,readOnly = false)
	public int insert (Reqaincie ie) {
		return super.getBaseMapper().insert(ie);
	}
	
	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED,readOnly = false)
	public int delect (Integer id) {
		QueryWrapper<Reqaincie> qw = new QueryWrapper<Reqaincie>();
		qw.eq("rvid",id);
		return super.getBaseMapper().delete(qw);
	}
	
	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED,readOnly = false)
	public int update (Reqaincie record) {
		return super.getBaseMapper().updateByPrimaryKey(record);
	}
	
	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED,readOnly = false)
	public int update2 (Integer id,Integer status) {
		return super.getBaseMapper().updteSj(id, status);
	}
}
