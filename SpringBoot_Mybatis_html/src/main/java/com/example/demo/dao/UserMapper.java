package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.User;
 
/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:20
 */
@Mapper
public interface UserMapper {
 
    User Sel(int id);
}