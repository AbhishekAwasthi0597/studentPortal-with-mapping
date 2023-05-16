package com.geekster.Student.Management.System.with.mapping.service;

import com.geekster.Student.Management.System.with.mapping.model.Student;
import com.geekster.Student.Management.System.with.mapping.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;
    public Student createStudent(Student student) {
        return  studentRepo.save(student);
    }

    public List<Student> getAllStudent() {
        return  studentRepo.findAll();
    }

    public Optional<Student> getStudent(int id) {
        return  studentRepo.findById(id);
    }

    public  Student updateStudent(int id,Student student) {
        Student existStudent = studentRepo.findById(id).get();
        existStudent.setName(student.getName());
        existStudent.setAge(student.getAge());
        existStudent.setPhoneNumber(student.getPhoneNumber());
        existStudent.setBranch(student.getBranch());
        existStudent.setDepartment(student.getDepartment());
        existStudent.setAddress(student.getAddress());
         return studentRepo.save(existStudent);
    }

    public void deleteStudent(int id) {
        studentRepo.deleteById(id);
    }
}
