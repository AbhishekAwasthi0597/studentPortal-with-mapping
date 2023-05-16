package com.geekster.Student.Management.System.with.mapping.service;

import com.geekster.Student.Management.System.with.mapping.model.Book;
import com.geekster.Student.Management.System.with.mapping.model.Course;
import com.geekster.Student.Management.System.with.mapping.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    BookRepo bookRepo;
    public Book addBook(Book book) {
        return bookRepo.save(book);
    }

    public List<Book> getAllBook() {
        return bookRepo.findAll();
    }

    public Optional<Book> getBook(int id) {
       return bookRepo.findById(id);
    }

    public Book updateBook(int id, Book book) {
       Book existingBook=bookRepo.findById(id).get();
       existingBook.setTitle(book.getTitle());
       existingBook.setAuthor(book.getAuthor());
       existingBook.setDescription(book.getDescription());
       existingBook.setPrice(book.getPrice());
       return bookRepo.save(existingBook);
    }

    public void deleteCourse(int id) {
        bookRepo.deleteById(id);
    }
}
