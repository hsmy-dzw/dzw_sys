package org.accp.service.wh;

import java.util.List;

import org.accp.dao.wh.MaintenServiceMapper;
import org.accp.pojo.MaintenService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service
@Transactional(propagation = Propagation.SUPPORTS,isolation = Isolation.READ_COMMITTED,readOnly = true)
public class MaintenServiceBiz  extends ServiceImpl<MaintenServiceMapper, MaintenService>{
	
	
	public List<MaintenService> list(){
		return super.getBaseMapper().selectList(null);
	}
	
	public int MainCount(Integer id) {
		QueryWrapper<MaintenService> qw= new QueryWrapper<MaintenService>();
		qw.eq("rvid", id);
		return super.getBaseMapper().selectCount(qw);
	}
	
	public MaintenService ce(String name) {
		QueryWrapper<MaintenService> qw = new QueryWrapper<MaintenService>();
		qw.eq("msname", name);
		return super.getBaseMapper().selectOne(qw);
	}
}
