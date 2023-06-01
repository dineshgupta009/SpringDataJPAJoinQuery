package com.SpringDataJPA.Repository;

import com.SpringDataJPA.Entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop,Long> {

    List<Laptop> findByBrandName(String brand);
}
