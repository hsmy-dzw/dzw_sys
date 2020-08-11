package org.accp.service.tl;

import org.apache.ibatis.annotations.Param;

public interface ProotService {
	int deleteByPpid(Integer ppid);

    int insertByList(Integer [] rids ,Integer ppid);
    
}
