package com.example.demo.service.imp;

import com.example.demo.dao.AmAreaMapper;
import com.example.demo.dao.AmOrgMapper;
import com.example.demo.model.AmOrg;
import com.example.demo.service.AmOrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AmOrgServiceImp implements AmOrgService {


    @Autowired
    AmOrgMapper amOrgMapper;
    @Override
    public List<AmOrg> selectAll() {
        return amOrgMapper.selectAll();
    }
}
