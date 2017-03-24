package com.loong.group.web.font;

import com.fasterxml.jackson.annotation.JsonView;
import com.loong.group.domain.Classes;
import com.loong.group.domain.Student;
import com.loong.group.service.ClassesService;
import com.loong.group.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Set;

/**
 * Created by loong on 2017-03-23.
 */
@Controller
@RequestMapping("/classes")
public class ClassesCtrl {

    @Autowired
    private ClassesService classesService;
    @RequestMapping("/list")
    public @ResponseBody
    List<Classes> list(){
        return classesService.findAll();
    }

}
