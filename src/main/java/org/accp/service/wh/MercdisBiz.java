package org.accp.service.wh;



	//商品资料
	

import org.accp.dao.wh.MercdisMapper;
import org.accp.pojo.Mercdis;
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
public class MercdisBiz extends ServiceImpl<MercdisMapper, Mercdis> {
	// 商品资料

	public PageInfo<Mercdis> pageInfo(page page) {
		PageHelper.startPage(page.getPageNum(), page.getPageSize());
		QueryWrapper<Mercdis> qw = new QueryWrapper<Mercdis>();
		if (!"".equals(page.getName()) && !page.getName().equals(null)) {
			qw.like("mdname", page.getName());
		}
		return new PageInfo<Mercdis>(super.getBaseMapper().selectList(qw));
	}

	public int count(Integer id) {
		QueryWrapper<Mercdis> qw = new QueryWrapper<Mercdis>();
		qw.eq("mdid", id);
		return super.getBaseMapper().selectCount(qw);
	}

	public int countSuplier(String code) {
		QueryWrapper<Mercdis> qw = new QueryWrapper<Mercdis>();
		qw.eq("scoed", code);
		return super.getBaseMapper().selectCount(qw);
	}

	public Mercdis showName(Integer id) {
		QueryWrapper<Mercdis> qw = new QueryWrapper<Mercdis>();
		qw.eq("mdid", id);
		return super.getBaseMapper().selectOne(qw);
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int insert(Mercdis dis) {
		return super.getBaseMapper().insert(dis);
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int update(Mercdis dis) {
		QueryWrapper<Mercdis> qw = new QueryWrapper<Mercdis>();
		qw.eq("mdid", dis.getMdid());
		return super.getBaseMapper().update(dis, qw);
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int updateStatus(Integer id, Integer status) {
		return super.getBaseMapper().updateStatus(id, status);
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int delect(Integer id) {
		QueryWrapper<Mercdis> qw = new QueryWrapper<Mercdis>();
		qw.eq("mdid", id);
		return super.getBaseMapper().delete(qw);
	}


}
