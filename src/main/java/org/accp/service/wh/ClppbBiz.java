package org.accp.service.wh;

import java.util.List;

import org.accp.dao.wh.ClppbMapper;
import org.accp.pojo.Clppb;
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
public class ClppbBiz extends ServiceImpl<ClppbMapper, Clppb> {
	
	public PageInfo<Clppb> pageinfo(page page){
		PageHelper.startPage(page.getPageNum(), page.getPageSize());
		QueryWrapper<Clppb> qw = new QueryWrapper<Clppb>();
		if(!"".equals(page.getName()) &&  !page.getName().equals(null)) {
			qw.like("pinname", page.getName()).or((t)->{
				t.eq("pszm", page.getName());
			}).or((c)->{
				c.eq("pid2", page.getName());
			});
		}
		return new PageInfo<Clppb>(super.getBaseMapper().selectList(qw));
	}
	
	public List<Clppb> list(){
		return super.getBaseMapper().selectList(null);
	}
	
	public int count(Integer pid2) {
		QueryWrapper<Clppb> qw = new QueryWrapper<Clppb>();
		qw.eq("pid2", pid2);
		return super.getBaseMapper().selectCount(qw);
	}
	
	public Clppb showcount(Integer pid2) {
		QueryWrapper<Clppb> qw = new QueryWrapper<Clppb>();
		qw.eq("pid2", pid2);
		return super.getBaseMapper().selectOne(qw);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int insert(Clppb db) {
		return super.getBaseMapper().insert(db);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int delect(Integer pid2) {
		QueryWrapper<Clppb> qw = new QueryWrapper<Clppb>();
		qw.eq("pid2", pid2);
		return super.getBaseMapper().delete(qw);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int update(Clppb cd) {
		QueryWrapper<Clppb> qw = new QueryWrapper<Clppb>();
		qw.eq("pid2", cd.getPid2());
		return super.getBaseMapper().update(cd, qw);
	}
	
	
	
}
