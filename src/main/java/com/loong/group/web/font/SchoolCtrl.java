package com.loong.group.web.font;

import com.loong.group.domain.Classes;
import com.loong.group.domain.School;
import com.loong.group.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by loong on 2017-03-23.
 */
@Controller
@RequestMapping("/school")
public class SchoolCtrl {

    @Autowired
    private SchoolService schoolService;
    @RequestMapping("/list")
    public @ResponseBody
    List<School> list(){
        return schoolService.findAll();
    }


}
