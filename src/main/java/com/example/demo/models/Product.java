package com.example.demo.models;

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
    private double price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setName(Object name2) {
		// TODO Auto-generated method stub
		
	}

	public void setPrice(Object price2) {
		// TODO Auto-generated method stub
		
	}

	public void setCategory(Object category2) {
		// TODO Auto-generated method stub
		
	}

    // Getters and Setters
}
