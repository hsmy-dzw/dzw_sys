package org.accp.service.wh;

import java.util.List;

import org.accp.dao.wh.CxbMapper;
import org.accp.pojo.Cxb;
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
public class CxbBiz extends ServiceImpl<CxbMapper, Cxb> {
	
	@Autowired
	private CxbMapper pr;
	
	public PageInfo<Cxb> cxbPageInfo(page page){
		PageHelper.startPage(page.getPageNum(), page.getPageSize());
		return new PageInfo<Cxb>(pr.list(page));
	}
	
	public PageInfo<Cxb> cxbPageInfo2(page page){
		PageHelper.startPage(page.getPageNum(), page.getPageSize());
		return new PageInfo<Cxb>(pr.list2(page));
	}
	
	public Cxb cxbModel(Integer xid) {
		return pr.cx(xid);
	}
	
	public int count (Integer id) {
		return pr.cx2(id);
	}
	
	public int cxbCount(Integer xid) {
		QueryWrapper<Cxb> queryWrapper = new QueryWrapper<Cxb>();
		queryWrapper.eq("xid", xid);
		return super.getBaseMapper().selectCount(queryWrapper);
	}
	
	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED,readOnly = false)
	public int cxBInsert(Cxb xb) {
		return super.getBaseMapper().insert(xb);
	}
	
	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED,readOnly = false)
	public int cxBDelect(Integer xid) {
		QueryWrapper<Cxb> qw  = new QueryWrapper<Cxb>();
		qw.eq("xid", xid);
		return super.getBaseMapper().delete(qw);
	}
	
	
	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED,readOnly = false)
	public int cxBUpdate(Cxb cxb) {
		return pr.cbxf(cxb);
	}
	
	public List<Cxb> querAllBypid2(Integer pid2){
		return pr.querAllBypid2(pid2);
	}
}
