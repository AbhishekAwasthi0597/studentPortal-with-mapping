package com.geekster.Student.Management.System.with.mapping.controller;

import com.geekster.Student.Management.System.with.mapping.model.Course;
import com.geekster.Student.Management.System.with.mapping.model.Laptop;
import com.geekster.Student.Management.System.with.mapping.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/laptop")
public class LaptopController {
    @Autowired
    LaptopService laptopService;
    @PostMapping()
    public ResponseEntity<Laptop> addLaptop(@RequestBody Laptop laptop){
       Laptop laptop1= laptopService.addLaptop(laptop);
        return  ResponseEntity.ok(laptop);
    }
    @GetMapping()
    public List<Laptop> getAllLaptop(){
        return  laptopService.getAllLaptop();
    }
    @GetMapping("/{id}")
    public Optional<Laptop> getStudent(@PathVariable int id){
        return  laptopService.getCourse(id);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Laptop> updateLaptop(@PathVariable int id, @RequestBody Laptop laptop){
        Laptop laptop1= laptopService.updatelaptop(id,laptop);
        return ResponseEntity.ok(laptop1);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLaptop(@PathVariable int id){
        laptopService.deleteLaptop(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
