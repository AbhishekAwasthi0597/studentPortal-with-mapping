package com.geekster.Student.Management.System.with.mapping.repo;

import com.geekster.Student.Management.System.with.mapping.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Integer> {
}
