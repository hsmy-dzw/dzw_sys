package org.accp.dao.tl;

import org.accp.pojo.Proot;

public interface ProotMapper {
    int deleteByPrimaryKey(Integer prootid);

    int insert(Proot record);

    int insertSelective(Proot record);

    Proot selectByPrimaryKey(Integer prootid);

    int updateByPrimaryKeySelective(Proot record);

    int updateByPrimaryKey(Proot record);
}