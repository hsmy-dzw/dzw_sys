package org.accp.service.yl;

import org.accp.dao.yl.PersonsMapper;
import org.accp.pojo.Persons;
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
public class PersonService 
extends ServiceImpl<PersonsMapper, Persons>
{
	
	@Autowired
	PersonsMapper mapper;
	
//	
	public PageInfo<Persons> queryPage(Integer pageNum,Integer pageSize,String name){
		PageHelper.startPage(pageNum,pageSize);
		return new PageInfo<Persons>(mapper.queryAll(name));
	}
	
	public Persons queryByA(String a) {
		return mapper.queryByA(a);
	}
	
	public Persons queryById(Integer id) {
		return mapper.queryById(id);
	}

}
