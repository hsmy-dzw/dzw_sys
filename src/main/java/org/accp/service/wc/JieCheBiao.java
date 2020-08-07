package org.accp.service.wc;

import org.accp.dao.wc.JcbMapper;
import org.accp.dao.wc.WxbMapper;
import org.accp.pojo.Jcb;
import org.accp.pojo.Wxb;
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
public class JieCheBiao extends ServiceImpl<JcbMapper, Jcb>{
//	@Autowired
//	private WxbMapper weixiubiao;
//	
//	public int savewxb(Wxb wxb) {
//		return weixiubiao.insert(wxb);
//	}
//	
	public PageInfo<Jcb> findByPage(Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum,pageSize);
		//获得mapper
		return new PageInfo<Jcb>(super.getBaseMapper().selectList(null));
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public boolean saveOne(Jcb temp) {
		
		int count=super.getBaseMapper().insert(temp);
		if("1".equals(temp.getJname())) {
			throw new RuntimeException("运行异常，将回滚失误！");
		}
		return count!=0;
	}
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public Jcb selectByid(String id) {
		
		return super.getBaseMapper().selectById(id);
	}
	
}
