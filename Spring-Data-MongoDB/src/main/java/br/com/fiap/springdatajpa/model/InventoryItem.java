package br.com.fiap.springdatajpa.model;

import org.springframework.data.annotation.Id;

public class InventoryItem {

	@Id
	private Integer productId;
	
	private Integer amount;

}
