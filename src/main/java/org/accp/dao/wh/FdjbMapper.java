package org.accp.dao.wh;

import java.util.List;

import org.accp.pojo.Fdjb;
import org.apache.ibatis.annotations.Param;

public interface FdjbMapper {
    int deleteByPrimaryKey(Integer fdjid);

    int insert(Fdjb record);

    int insertSelective(Fdjb record);

    Fdjb selectByPrimaryKey(Integer fdjid);

    int updateByPrimaryKeySelective(Fdjb record);

    int updateByPrimaryKey(Fdjb record);
    
    List<Fdjb> pageinfo1(@Param("fb") Fdjb Fdjb);
    
}