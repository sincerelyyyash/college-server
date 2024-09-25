package com.example.college_server.service;

import com.example.college_server.model.College;
import com.example.college_server.model.Course;
import com.example.college_server.repository.CollegeRepository;
import com.example.college_server.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeService {

    @Autowired
    private CollegeRepository collegeRepository;

    @Autowired
    private CourseRepository courseRepository;

    public List<College> getAllColleges() {
        return collegeRepository.findAll();
    }

    public College getCollegeByCourseName(String courseName) {
        Course course = courseRepository.findByName(courseName);
        return course != null ? course.getCollege() : null; // Now this works
    }
}
