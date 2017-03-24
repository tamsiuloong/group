package com.loong.group.web.font;

import com.loong.group.domain.Student;
import com.loong.group.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by loong on 2017-03-23.
 */
@Controller
@RequestMapping("/student")
public class StudentCtrl {

    @Autowired
    private StudentService studentService;
    @RequestMapping("/save")
    public  String save(Student student){
        studentService.save(student);
        return "redirect:../ok.html";
    }

}
