package com.example.demo.service.imp;

import com.example.demo.dao.AmAreaMapper;
import com.example.demo.dao.UserMapper;
import com.example.demo.model.AmArea;
import com.example.demo.service.AmAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AmAreaServiceImp implements AmAreaService {

    @Autowired
    AmAreaMapper amAreaMapper;
    @Override
    public List<AmArea> selectAll() {
        return amAreaMapper.selectAll();
    }
}
