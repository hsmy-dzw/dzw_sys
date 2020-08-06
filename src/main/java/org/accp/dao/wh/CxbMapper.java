package org.accp.dao.wh;

import java.util.List;

import org.accp.pojo.Cxb;
import org.accp.pojo.page;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface CxbMapper extends BaseMapper<Cxb>{
    List<Cxb> list(@Param("page") page page);
    List<Cxb> list2(@Param("page") page page);
    
    @Update("update cxb set pid2 = #{x.pid2},fdjid=#{x.fdjid},cxname=#{x.cxname} where xid=#{x.xid}")
    Integer cbxf(@Param("x") Cxb cxb);
    
    @Select("select *from cxb where xid = #{id}")
    Cxb cx(@Param("id")Integer id);

    public List<Cxb> querAllBypid2(@Param("pid2") Integer pid2 );

    @Select("select count(1) from cxb where pid2 = #{id}")
    Integer cx2(@Param("id")Integer id);
}