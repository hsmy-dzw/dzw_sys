package org.accp.dao.wh;

import org.accp.pojo.Reqaincie;

public interface ReqaincieMapper {
    int deleteByPrimaryKey(Integer rvid);

    int insert(Reqaincie record);

    int insertSelective(Reqaincie record);

    Reqaincie selectByPrimaryKey(Integer rvid);

    int updateByPrimaryKeySelective(Reqaincie record);

    int updateByPrimaryKey(Reqaincie record);
}