package com.SpringDataJPA.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
@Table(name = "tbl_laptop")
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private long id;
    private String name;
    private BigDecimal price;
    @OneToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

}
