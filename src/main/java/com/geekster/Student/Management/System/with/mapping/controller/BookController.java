package com.geekster.Student.Management.System.with.mapping.controller;

import com.geekster.Student.Management.System.with.mapping.model.Book;
import com.geekster.Student.Management.System.with.mapping.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;
    @PostMapping()
    public ResponseEntity<Book> addBook(@RequestBody Book book){
       Book  book1= bookService.addBook(book);
        return  ResponseEntity.ok(book1);
    }
    @GetMapping()
    public List<Book> getAllBook(){
        return  bookService.getAllBook();
    }
    @GetMapping("/{id}")
    public Optional<Book> getStudent(@PathVariable int id){
        return  bookService.getBook(id);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable int id, @RequestBody Book book){
         Book book1= bookService.updateBook(id,book);
        return ResponseEntity.ok(book1);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable int id){
        bookService.deleteCourse(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
