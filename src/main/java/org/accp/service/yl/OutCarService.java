package org.accp.service.yl;

import org.accp.dao.yl.OutCarMapper;
import org.accp.pojo.OutCar;
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
public class OutCarService extends ServiceImpl<OutCarMapper, OutCar>{
	@Autowired
	OutCarMapper mapper;
	
	public PageInfo<OutCar> queryAll(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<OutCar>(super.getBaseMapper().selectList(null));
	}
//	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
//	public void del(Integer id) {
//		// TODO Auto-generated method stub
//	}
	
//	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
//	public void insert(OutCar c) {
//		// TODO Auto-generated method stub
//		mapper.insert(c);
//	}

	public int updateByoid(Integer oid) {
		return mapper.updateByoid(oid);
	}
	public int updateByoid2(Integer oid) {
		return mapper.updateByoid2(oid);
	}
	
	
}
