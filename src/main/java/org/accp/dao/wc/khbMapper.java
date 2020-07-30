package org.accp.dao.wc;

import java.util.List;

import org.accp.pojo.khb;
import org.accp.pojo.khclb;
import org.apache.ibatis.annotations.Param;

public interface khbMapper {
    int deleteByPrimaryKey(Integer kid);

    int insert(khb record);

    int insertSelective(khb record);

    khb selectByPrimaryKey(Integer kid);

    int updateByPrimaryKeySelective(khb record);
    
    int updateByPrimaryKey(khb record);
    
    public List<khb> quertAllkhb();
    public khb quertAllkhbbyid(@Param("kid") Integer kid);
    public khb qurechclBycKehuxingxi(@Param("chepiao") String chepiao);
}