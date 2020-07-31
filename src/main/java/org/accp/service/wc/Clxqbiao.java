package org.accp.service.wc;

import org.accp.dao.wc.ClxqbMapper;
import org.accp.pojo.Clxqb;
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
public class Clxqbiao {
	@Autowired 
	private ClxqbMapper clxqmapper;
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void modifyPerson(Clxqb c) {
		clxqmapper.insert(c);
	}
	
	public PageInfo<Clxqb> findPersonListByPage(Integer pageNum, Integer pageSize,String wid) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Clxqb>(clxqmapper.querBywid(wid));
	}
}
