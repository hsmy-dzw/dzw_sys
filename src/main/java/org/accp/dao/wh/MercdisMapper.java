package org.accp.dao.wh;

import java.util.List;


import org.accp.pojo.Mercdis;



import org.accp.pojo.Mercdis;
import org.accp.pojo.page;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface MercdisMapper extends BaseMapper<Mercdis>{
    int deleteByPrimaryKey(Integer mdid);

    int insert(Mercdis record);

    int insertSelective(Mercdis record);

    Mercdis selectByPrimaryKey(Integer mdid);

    int updateByPrimaryKeySelective(Mercdis record);

    int updateByPrimaryKey(Mercdis record);
    


    @Update("update mercdis set mdstatus = #{status} where mdid = #{id}")
    int updateStatus(@Param("id")Integer id ,@Param("status")Integer status);
    
    List<Mercdis>  pageInfo(page page);

}