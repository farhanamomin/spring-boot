package com.farhana.lmspractice.repository;

import com.farhana.lmspractice.entity.CourseDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<CourseDetails,Integer> {
}
