package org.accp.service.wc;

import org.accp.dao.wc.WxbMapper;
import org.accp.dao.wc.WxxmbMapper;
import org.accp.pojo.Wxb;
import org.accp.pojo.Wxxmb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class WeiXiuXianmubiao {
	@Autowired
	private WxxmbMapper weixiuxiangmumapper;
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void addPerson(Wxxmb k) {
		weixiuxiangmumapper.insert(k);
	}
	
	public PageInfo<Wxxmb> findPersonListByPage(Integer pageNum, Integer pageSize,String wid) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Wxxmb>(weixiuxiangmumapper.querWeixiuxm(wid));
	}
}
