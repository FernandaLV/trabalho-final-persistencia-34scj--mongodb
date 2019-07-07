package br.com.fiap.spring.data.mongodb.service;

import br.com.fiap.spring.data.mongodb.model.Inventory;

import java.util.List;

public interface InventoryService {
	List<Inventory> getInventory();
	Inventory getInventoryItemByProductId(String id);
	Inventory createInventoryItem(Inventory inventory);
	void updateInventoryItem(Inventory inventory);
	void deleteInventoryItem(String id);
}
