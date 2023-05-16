package com.geekster.Student.Management.System.with.mapping.service;

import com.geekster.Student.Management.System.with.mapping.model.Course;
import com.geekster.Student.Management.System.with.mapping.model.Laptop;

import com.geekster.Student.Management.System.with.mapping.repo.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LaptopService {
    @Autowired
    LaptopRepo laptopRepo;
    public Laptop addLaptop(Laptop laptop) {
        return  laptopRepo.save(laptop);
    }

    public List<Laptop> getAllLaptop() {
        return  laptopRepo.findAll();
    }

    public Optional<Laptop> getCourse(int id) {
        return laptopRepo.findById(id);
    }

    public Laptop updatelaptop(int id, Laptop laptop) {
       Laptop existingLaptop=laptopRepo.findById(id).get();
       existingLaptop.setName(laptop.getName());
       existingLaptop.setBrand(laptop.getBrand());
       existingLaptop.setPrice(laptop.getPrice());
       return  laptopRepo.save(existingLaptop);
    }

    public void deleteLaptop(int id) {
         laptopRepo.deleteById(id);
    }
}
