package br.com.fiap.spring.data.mongodb.service;

import java.util.List;

import br.com.fiap.spring.data.mongodb.model.SalesOrder;

public interface SalesOrderService {
	List<SalesOrder> getAllSalesOrders();
	SalesOrder getSalesOrderById(String id);
	SalesOrder createSalesOrder(SalesOrder salesOrder);
	void updateSalesOrder(SalesOrder salesOrder);
	void deleteSalesOrder(String id);
}
