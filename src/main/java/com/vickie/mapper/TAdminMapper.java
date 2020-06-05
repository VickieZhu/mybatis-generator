package com.vickie.mapper;

import com.vickie.pojo.TAdmin;
import java.util.List;

public interface TAdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TAdmin record);

    TAdmin selectByPrimaryKey(Integer id);

    List<TAdmin> selectAll();

    int updateByPrimaryKey(TAdmin record);
}