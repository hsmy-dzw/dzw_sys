package org.accp.dao.wh;

import org.accp.pojo.Clppb;

public interface ClppbMapper {
    int deleteByPrimaryKey(Integer pid2);

    int insert(Clppb record);

    int insertSelective(Clppb record);

    Clppb selectByPrimaryKey(Integer pid2);

    int updateByPrimaryKeySelective(Clppb record);

    int updateByPrimaryKey(Clppb record);
}