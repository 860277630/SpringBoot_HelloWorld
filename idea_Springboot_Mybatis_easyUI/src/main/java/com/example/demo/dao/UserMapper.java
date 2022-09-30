package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.User;

import java.util.List;

@Mapper
public interface UserMapper {

    User Sel(int id);

    List<User> selAll();
}