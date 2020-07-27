package org.accp.dao.tl;

import org.accp.pojo.Position;

public interface PositionMapper {
    int deleteByPrimaryKey(Integer ppid);

    int insert(Position record);

    int insertSelective(Position record);

    Position selectByPrimaryKey(Integer ppid);

    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKey(Position record);
}