package br.com.fiap.springdatajpa.model;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Inventory {

	@Id
	private Integer id;

	private List<InventoryItem> inventoryItem;

}
