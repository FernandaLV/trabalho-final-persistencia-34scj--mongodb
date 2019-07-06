package br.com.fiap.springdatajpa.model;

import org.springframework.data.annotation.Id;

public class Category {

	/**
	 * Chave criada pelo próprio MongoDB
	 */
	@Id
	private String id;

	private String name;

	public Category(String name) {
		this.name = name;
	}

	public Category(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
