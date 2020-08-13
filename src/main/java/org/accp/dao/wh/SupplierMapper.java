package org.accp.dao.wh;

import org.accp.pojo.Supplier;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface SupplierMapper extends BaseMapper<Supplier> {
    int deleteByPrimaryKey(String scoed);



    int insertSelective(Supplier record);

    Supplier selectByPrimaryKey(String scoed);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);
}