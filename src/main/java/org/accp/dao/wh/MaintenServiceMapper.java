package org.accp.dao.wh;

import org.accp.pojo.MaintenService;

public interface MaintenServiceMapper {
    int deleteByPrimaryKey(Integer msid);

    int insert(MaintenService record);

    int insertSelective(MaintenService record);

    MaintenService selectByPrimaryKey(Integer msid);

    int updateByPrimaryKeySelective(MaintenService record);

    int updateByPrimaryKey(MaintenService record);
}