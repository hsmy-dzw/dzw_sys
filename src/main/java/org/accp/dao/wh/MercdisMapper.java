package org.accp.dao.wh;

import java.util.List;

import org.accp.pojo.Mercdis;

public interface MercdisMapper {
    int deleteByPrimaryKey(Integer mdid);

    int insert(Mercdis record);

    int insertSelective(Mercdis record);

    Mercdis selectByPrimaryKey(Integer mdid);

    int updateByPrimaryKeySelective(Mercdis record);

    int updateByPrimaryKey(Mercdis record);
    
   
}