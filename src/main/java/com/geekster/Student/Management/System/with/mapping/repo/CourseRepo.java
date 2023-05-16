package com.geekster.Student.Management.System.with.mapping.repo;

import com.geekster.Student.Management.System.with.mapping.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,Integer> {

}
