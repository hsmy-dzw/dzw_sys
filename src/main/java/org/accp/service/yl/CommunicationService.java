package org.accp.service.yl;

import org.accp.dao.yl.CommunicationMapper;
import org.accp.pojo.Communication;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class CommunicationService extends ServiceImpl<CommunicationMapper, Communication>{
	
}
