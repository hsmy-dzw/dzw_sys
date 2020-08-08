package org.accp.dao.yl;

import org.accp.pojo.Dept;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface DeptMapper extends BaseMapper<Dept>{
    int deleteByPrimaryKey(Integer peptid);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Integer peptid);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
}