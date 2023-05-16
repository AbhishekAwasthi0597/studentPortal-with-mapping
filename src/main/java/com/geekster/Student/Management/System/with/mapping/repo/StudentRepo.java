package com.geekster.Student.Management.System.with.mapping.repo;

import com.geekster.Student.Management.System.with.mapping.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
