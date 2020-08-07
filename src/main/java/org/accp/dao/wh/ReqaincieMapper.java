package org.accp.dao.wh;

import java.util.List;

import org.accp.pojo.Reqaincie;
import org.apache.ibatis.annotations.Param;

public interface ReqaincieMapper {
    int deleteByPrimaryKey(Integer rvid);

    int insert(Reqaincie record);

    int insertSelective(Reqaincie record);

    Reqaincie selectByPrimaryKey(Integer rvid);

    int updateByPrimaryKeySelective(Reqaincie record);

    int updateByPrimaryKey(Reqaincie record);
    
    public List<Reqaincie> querAll();
}