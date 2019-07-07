package br.com.fiap.spring.data.mongodb.model;

import org.springframework.data.annotation.Id;

public class Inventory {

	@Id
	private String id;

	private Integer amount;

	private Product product;

	public Inventory() {
	}

	public Inventory(Integer amount) {
		this.amount = amount;
	}

	public Inventory(Integer amount, Product product) {
		this.amount = amount;
		this.product = product;
	}

	public String getInventoryId() {
		return id;
	}

	public void setInventoryId(String id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}
}
