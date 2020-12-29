package com.example.demo.dao;


import java.util.List;

import com.example.demo.model.AmUserOrg;
import com.example.demo.model.AmUserOrgExample;
import com.example.demo.model.AmUserOrgKey;
import org.apache.ibatis.annotations.Param;

public interface AmUserOrgMapper {
    long countByExample(AmUserOrgExample example);

    int deleteByExample(AmUserOrgExample example);

    int deleteByPrimaryKey(AmUserOrgKey key);

    int insert(AmUserOrg record);

    int insertSelective(AmUserOrg record);

    List<AmUserOrg> selectByExample(AmUserOrgExample example);


    List<AmUserOrg> selectAll();

    AmUserOrg selectByPrimaryKey(AmUserOrgKey key);

    int updateByExampleSelective(@Param("record") AmUserOrg record, @Param("example") AmUserOrgExample example);

    int updateByExample(@Param("record") AmUserOrg record, @Param("example") AmUserOrgExample example);

    int updateByPrimaryKeySelective(AmUserOrg record);

    int updateByPrimaryKey(AmUserOrg record);
}