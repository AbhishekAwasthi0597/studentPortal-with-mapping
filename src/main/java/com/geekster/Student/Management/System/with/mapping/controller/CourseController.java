package com.geekster.Student.Management.System.with.mapping.controller;

import com.geekster.Student.Management.System.with.mapping.model.Course;
import com.geekster.Student.Management.System.with.mapping.model.Student;
import com.geekster.Student.Management.System.with.mapping.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    CourseService courseService;
    @PostMapping()
    public ResponseEntity<Course> createStudent(@RequestBody Course course){
        Course course1= courseService.createCourse(course);
        return  ResponseEntity.ok(course1);
    }
    @GetMapping()
    public List<Course> getAllCources(){
        return  courseService.getAllCourses();
    }
    @GetMapping("/{id}")
    public Optional<Course> getStudent(@PathVariable int id){
        return  courseService.getCourse(id);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Course> updateCourse(@PathVariable int id, @RequestBody Course course){
        Course course1= courseService.updateCourse(id,course);
        return ResponseEntity.ok(course1);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCourse(@PathVariable int id){
        courseService.deleteCourse(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
