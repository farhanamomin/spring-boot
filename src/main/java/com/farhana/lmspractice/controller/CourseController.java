package com.farhana.lmspractice.controller;


import com.farhana.lmspractice.entity.CourseDetails;
import com.farhana.lmspractice.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class CourseController {

    @Autowired
    CourseService courseService;
      @GetMapping("welcome")
    public  String welcomeMessage(){
        return "WELCOME";
    }



    @GetMapping("getAll")
    public List<CourseDetails> getAll(){
        return courseService.getAll();
    }
}
