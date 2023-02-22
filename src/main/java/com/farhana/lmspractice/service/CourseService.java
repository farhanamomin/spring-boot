package com.farhana.lmspractice.service;

import com.farhana.lmspractice.entity.CourseDetails;
import com.farhana.lmspractice.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepo courseRepo;

    public List<CourseDetails>getAll(){
      return    courseRepo.findAll();
    }
}
