package com.example.demo.dao;


import java.util.List;

import com.example.demo.model.AmArea;
import com.example.demo.model.AmAreaExample;
import org.apache.ibatis.annotations.Param;

public interface AmAreaMapper {
    long countByExample(AmAreaExample example);

    int deleteByExample(AmAreaExample example);

    int deleteByPrimaryKey(String areaId);

    int insert(AmArea record);

    int insertSelective(AmArea record);

    List<AmArea> selectByExample(AmAreaExample example);


    List<AmArea> selectAll();

    AmArea selectByPrimaryKey(String areaId);

    int updateByExampleSelective(@Param("record") AmArea record, @Param("example") AmAreaExample example);

    int updateByExample(@Param("record") AmArea record, @Param("example") AmAreaExample example);

    int updateByPrimaryKeySelective(AmArea record);

    int updateByPrimaryKey(AmArea record);
}