package com.geekster.Student.Management.System.with.mapping.service;

import com.geekster.Student.Management.System.with.mapping.model.Course;
import com.geekster.Student.Management.System.with.mapping.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
     @Autowired
    CourseRepo courseRepo;
    public Course createCourse(Course course) {
        return  courseRepo.save(course);
    }

    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    public Optional<Course> getCourse(int id) {
        return  courseRepo.findById(id);
    }

    public Course updateCourse(int id, Course course) {
        Course existingCourse=courseRepo.findById(id).get();
        existingCourse.setTitle(course.getTitle());
        existingCourse.setDescription(course.getDescription());
        existingCourse.setDuration(course.getDuration());
        return   courseRepo.save(existingCourse);
    }

    public void deleteCourse(int id) {
        courseRepo.deleteById(id);
    }
}
