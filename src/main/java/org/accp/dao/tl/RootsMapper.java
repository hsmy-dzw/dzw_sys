package org.accp.dao.tl;

import java.util.List;

import org.accp.pojo.Roots;

public interface RootsMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(Roots record);

    int insertSelective(Roots record);

    Roots selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(Roots record);

    int updateByPrimaryKey(Roots record);
    
    List<Roots> queryAll();
}