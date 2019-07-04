package br.com.fiap.springdatajpa.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

public class Category {

	@Id
	private Integer id;

	private String name;

	private List<Product> products = new ArrayList<Product>();

	public Category(Integer id, String name, List<Product> products) {
		super();
		this.id = id;
		this.name = name;
		this.products = products;
	}

	public Category() {
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

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
