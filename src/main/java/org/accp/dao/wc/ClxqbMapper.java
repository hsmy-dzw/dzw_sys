package org.accp.dao.wc;

import java.util.List;

import org.accp.pojo.Clxqb;
import org.springframework.web.bind.annotation.PathVariable;

public interface ClxqbMapper {
    int deleteByPrimaryKey(Integer clid);

    int insert(Clxqb record);

    int insertSelective(Clxqb record);

    Clxqb selectByPrimaryKey(Integer clid);

    int updateByPrimaryKeySelective(Clxqb record);

    int updateByPrimaryKey(Clxqb record);
    
    public List<Clxqb> querBywid(@PathVariable("wid") String wid);
}