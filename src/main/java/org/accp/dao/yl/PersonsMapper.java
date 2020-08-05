package org.accp.dao.yl;

import java.util.List;

import org.accp.pojo.Persons;
import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface PersonsMapper extends BaseMapper<Persons>{
    int deleteByPrimaryKey(Integer pid);

    int insert(Persons record);

    int insertSelective(Persons record);

    Persons selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Persons record);

    int updateByPrimaryKey(Persons record);
    
	List<Persons> queryAll(@Param("name") String name);
}