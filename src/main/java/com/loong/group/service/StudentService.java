package com.loong.group.service;

import com.loong.group.common.page.Pagination;
import com.loong.group.domain.Student;

/**
 * Created by loong on 2017-03-23.
 */
public interface StudentService {
    void save(Student student);

    Pagination queryForPage(String keyWord, Integer pageNo, Integer pageSize);

    void delete(Integer id);
}
