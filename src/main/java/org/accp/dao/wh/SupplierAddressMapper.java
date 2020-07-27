package org.accp.dao.wh;

import org.accp.pojo.SupplierAddress;

public interface SupplierAddressMapper {
    int deleteByPrimaryKey(Integer said);

    int insert(SupplierAddress record);

    int insertSelective(SupplierAddress record);

    SupplierAddress selectByPrimaryKey(Integer said);

    int updateByPrimaryKeySelective(SupplierAddress record);

    int updateByPrimaryKey(SupplierAddress record);
}