package org.accp.dao.wh;

import java.util.List;

import org.accp.pojo.Fdjb;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface FdjbMapper extends BaseMapper<Fdjb> {
    int deleteByPrimaryKey(Integer fdjid);

    int insert(Fdjb record);

    int insertSelective(Fdjb record);

    Fdjb selectByPrimaryKey(Integer fdjid);

    int updateByPrimaryKeySelective(Fdjb record);

    int updateByPrimaryKey(Fdjb record);
    
    List<Fdjb> pageinfo1(@Param("fb") Fdjb Fdjb);
    
    @Select("select *from fdjb")
    List<Fdjb>list2();
} 