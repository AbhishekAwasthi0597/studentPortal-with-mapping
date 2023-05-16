package com.geekster.Student.Management.System.with.mapping.repo;

import com.geekster.Student.Management.System.with.mapping.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepo extends JpaRepository<Laptop,Integer> {
}
