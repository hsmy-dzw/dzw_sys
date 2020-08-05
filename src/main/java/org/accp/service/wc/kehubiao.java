package org.accp.service.wc;

import org.accp.dao.wc.khbMapper;
import org.accp.pojo.khb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class kehubiao {

	@Autowired
	private khbMapper kehub;

	public PageInfo<khb> findPersonListByPage(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<khb>(kehub.quertAllkhb());
	}

	public khb getPersonById(Integer kid) {
		return kehub.quertAllkhbbyid(kid);
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void removePersonById(Integer kid) {
		kehub.deleteByPrimaryKey(kid);
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void modifyPerson(khb k) {
		kehub.updateByPrimaryKey(k);
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void addPerson(khb k) {
		kehub.insert(k);
	}
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public khb querByChepiao(String chepiao) {
		
		return  kehub.qurechclBycKehuxingxi(chepiao);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public String  querMaxid() {
		return kehub.querMaxid();
	}
	public Integer querMaxkid() {
		return kehub.querMaxkid();
	}
}
