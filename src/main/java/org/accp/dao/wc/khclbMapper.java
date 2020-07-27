package org.accp.dao.wc;

import java.util.List;

import org.accp.pojo.khclb;
import org.apache.ibatis.annotations.Param;

public interface khclbMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(khclb record);

    int insertSelective(khclb record);

    khclb selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(khclb record);

    int updateByPrimaryKey(khclb record);
    
    public List<khclb> qurechclByid(@Param("kid") Integer kid);
    
    public khclb qurechclBycid(@Param("cid") Integer cid);
}