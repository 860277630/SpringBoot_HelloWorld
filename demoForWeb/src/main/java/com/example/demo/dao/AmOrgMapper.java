package com.example.demo.dao;


import java.util.List;

import com.example.demo.model.AmOrg;
import com.example.demo.model.AmOrgExample;
import org.apache.ibatis.annotations.Param;

public interface AmOrgMapper {
    long countByExample(AmOrgExample example);

    int deleteByExample(AmOrgExample example);

    int deleteByPrimaryKey(String orgId);

    int insert(AmOrg record);

    int insertSelective(AmOrg record);

    List<AmOrg> selectByExample(AmOrgExample example);


    List<AmOrg> selectAll();

    AmOrg selectByPrimaryKey(String orgId);

    int updateByExampleSelective(@Param("record") AmOrg record, @Param("example") AmOrgExample example);

    int updateByExample(@Param("record") AmOrg record, @Param("example") AmOrgExample example);

    int updateByPrimaryKeySelective(AmOrg record);

    int updateByPrimaryKey(AmOrg record);
}