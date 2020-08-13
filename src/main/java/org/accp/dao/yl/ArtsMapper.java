package org.accp.dao.yl;

import java.util.List;

import org.accp.pojo.Arts;
import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface ArtsMapper extends BaseMapper<Arts>{

	List<Arts> queryAll(@Param("name") String name);

}
