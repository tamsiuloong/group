package com.loong.group.service.impl;

import com.loong.group.common.page.Pagination;
import com.loong.group.dao.BaseDao;
import com.loong.group.domain.Student;
import com.loong.group.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by loong on 2017-03-23.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private BaseDao<Student,Integer> dao;
    @Override
    public void save(Student student) {
        dao.save(student);
    }

    @Override
    public Pagination queryForPage(String keyWord, Integer pageNo, Integer pageSize) {
        String hql = "from Student s where 1=1";
        if(keyWord!=null&&!keyWord.isEmpty()){
            hql += " and s.name=?";
        }
        return dao.pageByHql(hql,pageNo,pageSize,keyWord);
    }

    @Override
    public void delete(Integer id) {
        dao.deleteById(Student.class,id);
    }
}
