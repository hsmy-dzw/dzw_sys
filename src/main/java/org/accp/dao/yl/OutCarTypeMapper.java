package org.accp.dao.yl;

import org.accp.pojo.OutCarType;

public interface OutCarTypeMapper {
    int deleteByPrimaryKey(Integer otid);

    int insert(OutCarType record);

    int insertSelective(OutCarType record);

    OutCarType selectByPrimaryKey(Integer otid);

    int updateByPrimaryKeySelective(OutCarType record);

    int updateByPrimaryKey(OutCarType record);
}