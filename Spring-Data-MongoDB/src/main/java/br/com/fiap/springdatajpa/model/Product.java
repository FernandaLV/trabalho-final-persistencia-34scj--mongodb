package br.com.fiap.springdatajpa.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

public class Product {
	
	@Id
	private Integer id;
	
	private String name;	
	private String description;
	private Double price;
	
	private List<Category> categories = new ArrayList<Category>();

	public Product(Integer id, String name, String description, Double price, List<Category> categories) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.categories = categories;
	}	

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	
}
