package org.accp.dao.wh;

import org.accp.pojo.Cxb;

public interface CxbMapper {
    int deleteByPrimaryKey(Integer xid);

    int insert(Cxb record);

    int insertSelective(Cxb record);

    Cxb selectByPrimaryKey(Integer xid);

    int updateByPrimaryKeySelective(Cxb record);

    int updateByPrimaryKey(Cxb record);
}