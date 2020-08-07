package org.accp.dao.wh;

import java.util.List;

import org.accp.pojo.Reqaincie;
import org.accp.pojo.page;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface ReqaincieMapper extends BaseMapper<Reqaincie> {
    int deleteByPrimaryKey(Integer rvid);

    int insert(Reqaincie record);

    int insertSelective(Reqaincie record);

    Reqaincie selectByPrimaryKey(Integer rvid);
    
    
    @Select("SELECT* FROM reqaincie a INNER JOIN  MaintenService b ON a.`msid` = b.`msid` WHERE a.`rvid` = #{rvid}")
    @ResultMap("BaseResultMap")
    Reqaincie selectByPrimaryKey2(Integer rvid);

    int updateByPrimaryKeySelective(Reqaincie record);

    int updateByPrimaryKey(Reqaincie record);
    
    @Update("UPDATE reqaincie SET rvstatus = #{status} WHERE rvid=#{id}")
    int updteSj(@Param("id") Integer id,@Param("status") Integer status);
    
    @Select("select count(1) from reqaincie where rvid = #{id}")
   int countID(@Param("id") Integer id);
    
    List<Reqaincie> pageinfo(@Param("page") page pag);
}