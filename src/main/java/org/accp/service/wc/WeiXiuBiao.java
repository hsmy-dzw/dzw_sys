package org.accp.service.wc;

import java.util.List;

import org.accp.dao.wc.WxbMapper;
import org.accp.dao.wc.khclbMapper;
import org.accp.pojo.Wxb;
import org.accp.pojo.khb;
import org.accp.pojo.khclb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class WeiXiuBiao {
	@Autowired
	private WxbMapper weixiubiaomapper;
	
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void addPerson(Wxb k) {
		weixiubiaomapper.insert(k);
	}
	
	public PageInfo<Wxb> findPersonListByPage(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Wxb>(weixiubiaomapper.querWeixiuxx());
	}
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public Wxb getPersonById(String wid) {
		return weixiubiaomapper.querWeixiuxxByid(wid);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void modifyPerson(Wxb w) {
		weixiubiaomapper.updateByPrimaryKey(w);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void updatewstate(String wstate,String wid) {
		weixiubiaomapper.querWeixiuxxBylx(wstate, wid);
	}
	
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	 public PageInfo<Wxb> queryWeixiuByStatic(Integer pageNum, Integer pageSize){
		PageHelper.startPage(pageNum,pageSize);
		return new PageInfo<Wxb>(weixiubiaomapper.queryWeixiuByStatic());
	}
}
