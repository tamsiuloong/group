package com.loong.group.service.impl;

import com.loong.group.dao.BaseDao;
import com.loong.group.domain.Classes;
import com.loong.group.domain.School;
import com.loong.group.service.ClassesService;
import com.loong.group.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by loong on 2017-03-23.
 */
@Service
public class SchoolServiceImpl implements SchoolService {


    @Autowired
    private BaseDao<School,Integer> dao;
    @Override
    public List<School> findAll() {
        return dao.getListByHQL("from School");
    }
}
