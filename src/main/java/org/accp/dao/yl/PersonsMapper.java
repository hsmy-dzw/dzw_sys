package org.accp.dao.yl;

import org.accp.pojo.Persons;

public interface PersonsMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Persons record);

    int insertSelective(Persons record);

    Persons selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Persons record);

    int updateByPrimaryKey(Persons record);
}