package org.accp.dao.wc;

import java.util.List;

import org.accp.pojo.Wxb;
import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface WxbMapper extends BaseMapper<Wxb>{
    int deleteByPrimaryKey(String wid);

    int insert(Wxb record);

    int insertSelective(Wxb record);

    Wxb selectByPrimaryKey(String wid);

    int updateByPrimaryKeySelective(Wxb record);

    int updateByPrimaryKey(Wxb record);
    
    public List<Wxb> querWeixiuxx();
    
    public Wxb querWeixiuxxByid(@Param("wid") String wid);
    
     int querWeixiuxxBylx(@Param("wstate") String wstate ,@Param("wid") String wid);
     int querWeixiuxxBylxs(@Param("wstate") String wstate ,@Param("wid") String wid,@Param("jiefan") String jiefan);
    List<Wxb> queryWeixiuByStatic();
    
    
     
     public List<Wxb> querWrixiuwanc();
     
     public int updatejiage(@Param("wid") String wid,@Param("jiage") Float jiage);
     
    
	public int updatefanggong(@Param("fglx") String fglx,@Param("yy") String yy,@Param("wid") String wid);
	public int updatestatcbyjungong(@Param("wid") String wid);
}