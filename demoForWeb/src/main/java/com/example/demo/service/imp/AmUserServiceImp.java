package com.example.demo.service.imp;

import com.example.demo.dao.AmUserMapper;
import com.example.demo.dao.AmUserOrgMapper;
import com.example.demo.model.AmUser;
import com.example.demo.model.AmUserOrg;
import com.example.demo.service.AmUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AmUserServiceImp implements AmUserService {


    @Autowired
    AmUserMapper amUserMapper;

    @Override
    public List<AmUser> selectAll() {
        return amUserMapper.selectAll();
    }
}
