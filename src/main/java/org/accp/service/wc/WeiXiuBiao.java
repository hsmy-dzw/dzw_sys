package org.accp.service.wc;

import org.accp.dao.wc.WxbMapper;
import org.accp.pojo.Wxb;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class WeiXiuBiao extends ServiceImpl<WxbMapper, Wxb>{
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
	
	  public void querWeixiuxxBylxs(String wstate ,String wid, String jiefan) {
		  weixiubiaomapper.querWeixiuxxBylxs(wstate, wid,jiefan);
	  }
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int updatestatcbyjungong(String wid) {
		return weixiubiaomapper.updatestatcbyjungong(wid);
	}

	
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	 public PageInfo<Wxb> queryWeixiuByStatic(Integer pageNum, Integer pageSize){
		PageHelper.startPage(pageNum,pageSize);
		return new PageInfo<Wxb>(weixiubiaomapper.queryWeixiuByStatic());

	}
	

	public PageInfo<Wxb> findPersonListByPage2(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Wxb>(weixiubiaomapper.querWrixiuwanc());
	}
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void updatefglx(String fglx,String yy,String wid) {
		weixiubiaomapper.updatefanggong(fglx, yy, wid);
	}
}
