package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
@Data
	@Entity
	public class Warehouse {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    private String location;

	   
}
