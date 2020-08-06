package org.accp.dao.wh;

import org.accp.pojo.MaintenService;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface MaintenServiceMapper extends BaseMapper<MaintenService>{
    int deleteByPrimaryKey(Integer msid);

    int insert(MaintenService record);

    int insertSelective(MaintenService record);

    MaintenService selectByPrimaryKey(Integer msid);

    int updateByPrimaryKeySelective(MaintenService record);

    int updateByPrimaryKey(MaintenService record);
}