package org.accp.dao.wh;

import org.accp.pojo.Supplier;

public interface SupplierMapper {
    int deleteByPrimaryKey(String scoed);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    Supplier selectByPrimaryKey(String scoed);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);
}