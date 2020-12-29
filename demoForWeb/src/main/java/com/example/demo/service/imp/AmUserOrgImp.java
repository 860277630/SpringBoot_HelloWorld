package com.example.demo.service.imp;

import com.example.demo.dao.AmOrgMapper;
import com.example.demo.dao.AmUserOrgMapper;
import com.example.demo.model.AmUserOrg;
import com.example.demo.service.AmUserOrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AmUserOrgImp implements AmUserOrgService {

    @Autowired
    AmUserOrgMapper amUserOrgMapper;
    @Override
    public List<AmUserOrg> selectAll() {
        return amUserOrgMapper.selectAll();
    }
}
