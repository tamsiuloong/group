package com.loong.group.web.admin;

import com.loong.group.common.page.Pagination;
import com.loong.group.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by loong on 2017-03-23.
 */
@Controller
@RequestMapping("/student/")
public class StudentAdminCtrl {

    @Autowired
    private StudentService studentService;
    @RequestMapping(value="/list")
    public @ResponseBody
    Pagination list(Integer pageNo, Integer pageSize, String keyWord, ModelMap map){
        if(pageNo==null){
            pageNo=1;
        }
        if(pageSize==null){
            pageSize=10;
        }
        Pagination pagination =studentService.queryForPage(keyWord,pageNo ,pageSize);

        return pagination;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public @ResponseBody Boolean delete(@PathVariable("id") Integer id){
        studentService.delete(id);
        return true;
    }
}
