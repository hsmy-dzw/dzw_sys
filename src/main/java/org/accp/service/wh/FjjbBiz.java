package org.accp.service.wh;

import java.util.List;

import org.accp.dao.wh.FdjbMapper;
import org.accp.pojo.Fdjb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class FjjbBiz {

	@Autowired
	private FdjbMapper pr;

	public PageInfo<Fdjb> pageinfo(Fdjb Fdjb) {
		// TODO Auto-generated method stub
		PageHelper.startPage(Fdjb.getPageNum(), Fdjb.getPageSize());
		return new PageInfo<Fdjb>(pr.pageinfo1(Fdjb));
	}

	public Fdjb selectByPrimaryKey(Integer id) {
		return pr.selectByPrimaryKey(id);
	}
	
	public List<Fdjb> pagelist(){
		return pr.list2();
	}
 
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int insert(Fdjb Fdjb) {
		return pr.insert(Fdjb);
	}

	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int deleteByPrimaryKey(Integer id) {
		return pr.deleteByPrimaryKey(id);
	}
	
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int updateByPrimaryKeySelective(Fdjb record) {
		return pr.updateByPrimaryKeySelective(record);
	}

}
