package org.accp.dao.yl;

import org.accp.pojo.Dept;

public interface DeptMapper {
    int deleteByPrimaryKey(Integer peptid);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Integer peptid);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
}