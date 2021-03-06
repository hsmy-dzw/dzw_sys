package org.accp.dao.yl;

import java.util.List;

import org.accp.pojo.OutCar;
import org.accp.pojo.khb;
import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface OutCarMapper extends BaseMapper<OutCar>{
    int deleteByPrimaryKey(Integer oid);

    int insert(OutCar record);

    int insertSelective(OutCar record);

    OutCar selectByPrimaryKey(Integer oid);

    int updateByPrimaryKeySelective(OutCar record);

    int updateByPrimaryKey(OutCar record);

	public List<OutCar> queryAll();
	
	int updateByoid(@Param("oid") Integer oid);
	int updateByoid2(@Param("oid") Integer oid);
}