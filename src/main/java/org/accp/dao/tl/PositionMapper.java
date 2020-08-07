package org.accp.dao.tl;

import java.util.List;

import org.accp.pojo.Position;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface PositionMapper extends BaseMapper<Position>{
    int deleteByPrimaryKey(Integer ppid);

    int insert(Position record);

    int insertSelective(Position record);

    Position selectByPrimaryKey(Integer ppid);

    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKey(Position record);
    
    List<Position> queryAll();
}