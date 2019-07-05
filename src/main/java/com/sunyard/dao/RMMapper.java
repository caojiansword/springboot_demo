package com.sunyard.dao;

import com.sunyard.model.RM;
import com.sunyard.model.RMExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface RMMapper {
    long countByExample(RMExample example);

    int deleteByExample(RMExample example);

    int insert(RM record);

    int insertSelective(RM record);

    List<RM> selectByExample(RMExample example);

    int updateByExampleSelective(@Param("record") RM record, @Param("example") RMExample example);

    int updateByExample(@Param("record") RM record, @Param("example") RMExample example);
}