package org.accp.service.yl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.accp.dao.yl.DeptMapper;
import org.accp.pojo.Dept;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class DeptService extends ServiceImpl<DeptMapper, Dept>{
	
	public Map<String, Object> queryAllDeptTree() {
		QueryWrapper<Dept> wq = Wrappers.query();
		Dept de = super.getBaseMapper().selectOne(wq);
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		return map;
	}

	public List<Dept> queryAll() {
		// TODO Auto-generated method stub
		return super.getBaseMapper().selectList(null);
	}
}
