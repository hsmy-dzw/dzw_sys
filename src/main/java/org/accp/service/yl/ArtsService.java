package org.accp.service.yl;

import java.util.List;

import org.accp.dao.yl.ArtsMapper;
import org.accp.pojo.Arts;
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
public class ArtsService extends ServiceImpl<ArtsMapper, Arts>{
	
	@Autowired
	ArtsMapper mapper;

	public PageInfo<Arts> queryAll(Integer num, Integer size, String name) {
		// TODO Auto-generated method stub
		PageHelper.startPage(num,size);
		List<Arts> page = mapper.queryAll(name);
		for (Arts arts : page) {
			System.out.println(arts.getAname());
		}
		return new PageInfo<Arts>(page);
	}


	

	
}
