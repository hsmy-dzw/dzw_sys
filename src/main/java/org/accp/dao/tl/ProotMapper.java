package org.accp.dao.tl;

import org.accp.pojo.Proot;
import org.apache.ibatis.annotations.Param;

public interface ProotMapper {
    int deleteByPrimaryKey(Integer prootid);

    int insert(Proot record);

    int insertSelective(Proot record);

    Proot selectByPrimaryKey(Integer prootid);

    int updateByPrimaryKeySelective(Proot record);

    int updateByPrimaryKey(Proot record);

	int deleteByPpid(Integer ppid);

	int insertByList(@Param("rids")Integer[] rids, @Param("ppid")Integer ppid);
}