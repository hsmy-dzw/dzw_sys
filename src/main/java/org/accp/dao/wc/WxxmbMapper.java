package org.accp.dao.wc;

import java.util.List;

import org.accp.pojo.Wxxmb;
import org.apache.ibatis.annotations.Param;

public interface WxxmbMapper {
    int deleteByPrimaryKey(Integer wxid);

    int insert(Wxxmb record);

    int insertSelective(Wxxmb record);

    Wxxmb selectByPrimaryKey(Integer wxid);

    int updateByPrimaryKeySelective(Wxxmb record);

    int updateByPrimaryKey(Wxxmb record);
    public List<Wxxmb> querWeixiuxm(@Param("wid") String wid);
    public int querWeijiage(@Param("wid") String wid);
    public int querWeijiage2(@Param("wid") String wid);
    public String querWeijiage3(@Param("wid") String wid);
    
    
}