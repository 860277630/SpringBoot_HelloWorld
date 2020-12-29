package com.example.demo.dao;


import java.util.List;

import com.example.demo.model.AmUser;
import com.example.demo.model.AmUserExample;
import org.apache.ibatis.annotations.Param;

public interface AmUserMapper {
    long countByExample(AmUserExample example);

    int deleteByExample(AmUserExample example);

    int deleteByPrimaryKey(String userId);

    int insert(AmUser record);

    int insertSelective(AmUser record);

    List<AmUser> selectByExample(AmUserExample example);

    List<AmUser> selectAll();

    AmUser selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") AmUser record, @Param("example") AmUserExample example);

    int updateByExample(@Param("record") AmUser record, @Param("example") AmUserExample example);

    int updateByPrimaryKeySelective(AmUser record);

    int updateByPrimaryKey(AmUser record);
}