package com.example.demo.entity;

import java.math.BigDecimal;
import java.util.function.Supplier;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    private String sku;
	    private BigDecimal price;

	    @ManyToOne
	    @JoinColumn(name = "supplier_id")
	    private Supplier supplier;

	   

}
