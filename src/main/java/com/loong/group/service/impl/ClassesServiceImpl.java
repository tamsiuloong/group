package com.loong.group.service.impl;

import com.loong.group.dao.BaseDao;
import com.loong.group.domain.Classes;
import com.loong.group.service.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by loong on 2017-03-23.
 */
@Service
public class ClassesServiceImpl implements ClassesService {


    @Autowired
    private BaseDao<Classes,Integer> dao;
    @Override
    public List<Classes> findAll() {
        return dao.getListByHQL("from Classes");
    }
}
