package org.accp.service.wc;

import org.accp.dao.wc.khbMapper;
import org.accp.dao.wc.khclbMapper;
import org.accp.pojo.khb;
import org.accp.pojo.khclb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class kehucheliangbiao {
	@Autowired
	private khclbMapper kehucheliangbiaomapper;

	public PageInfo<khclb> findPersonListByPage(Integer pageNum, Integer pageSize,Integer kid) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<khclb>(kehucheliangbiaomapper.qurechclByid(kid));
	}
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public khclb getPersonById(Integer cid) {
		return kehucheliangbiaomapper.qurechclBycid(cid);
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void removePersonById(Integer cid) {
		kehucheliangbiaomapper.deleteByPrimaryKey(cid);
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void modifyPerson(khclb k) {
		kehucheliangbiaomapper.updateByPrimaryKey(k);
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void addPerson(khclb k) {
		kehucheliangbiaomapper.insert(k);
	}
}
