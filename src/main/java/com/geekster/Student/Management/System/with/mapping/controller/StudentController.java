package com.geekster.Student.Management.System.with.mapping.controller;

import com.geekster.Student.Management.System.with.mapping.model.Student;
import com.geekster.Student.Management.System.with.mapping.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping()
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
       Student student1= studentService.createStudent(student);
       return  ResponseEntity.ok(student1);
    }
    @GetMapping()
    public List<Student> getAllStudent(){
        return  studentService.getAllStudent();
    }
    @GetMapping("/{id}")
    public Optional<Student> getStudent(@PathVariable int id){
        return  studentService.getStudent(id);
    }
     @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable int id, @RequestBody Student student){
        Student student1= studentService.updateStudent(id,student);
         return ResponseEntity.ok(student1);
     }
     @DeleteMapping("/{id}")
     public ResponseEntity<Void> deleteStudent(@PathVariable int id){
            studentService.deleteStudent(id);
         return new ResponseEntity<>(HttpStatus.NO_CONTENT);
     }
}
