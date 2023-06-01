package com.SpringDataJPA.Controller;

import com.SpringDataJPA.Entity.Brand;
import com.SpringDataJPA.Entity.Laptop;
import com.SpringDataJPA.Repository.BrandRepository;
import com.SpringDataJPA.Repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaptopController {

    @Autowired
    private BrandRepository brandRepository;

    @Autowired
    private LaptopRepository laptopRepository;

    @GetMapping("/laptop")
    public ResponseEntity<List<Laptop>>  getLaptopByBrandName(@RequestParam String brand){
        return new ResponseEntity<List<Laptop>>(laptopRepository.findByBrandName(brand), HttpStatus.OK);
    }
}
