package br.com.fiap.spring.data.mongodb.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import br.com.fiap.spring.data.mongodb.advice.ResponseError;
import br.com.fiap.spring.data.mongodb.model.SalesOrder;
import br.com.fiap.spring.data.mongodb.service.SalesOrderService;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.fiap.spring.data.mongodb.repository.SalesOrderRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class SalesOrderServiceImpl implements SalesOrderService {
	
	@Autowired
	private SalesOrderRepository salesOrderRepository;
	
	@Override
	public List<SalesOrder> getAllSalesOrders() {
		List<SalesOrder> salesOrder = StreamSupport.stream(salesOrderRepository.findAll().spliterator(), false)
				.collect(Collectors.toList());
		return salesOrder;
	}

	@Override
	public SalesOrder getSalesOrderById(String id) {
		return salesOrderRepository.findById(id).orElseThrow(() ->
				new ResponseError(HttpStatus.NOT_FOUND, "Pedido de venda não encontrado"));
	}

	@Override
	public SalesOrder createSalesOrder(SalesOrder salesOrder) {
		return salesOrderRepository.save(salesOrder);
	}

	@Override
	public void updateSalesOrder(SalesOrder salesOrder) {

		SalesOrder storedSalesOrder = salesOrderRepository.findById(salesOrder.getId()).orElseThrow(() ->
				new ResponseError(HttpStatus.NOT_FOUND, "Pedido de venda não encontrado"));

		storedSalesOrder.setCreatedDate(salesOrder.getCreatedDate());
		storedSalesOrder.setCustomer(salesOrder.getCustomer());
		storedSalesOrder.setItens(salesOrder.getItens());
		storedSalesOrder.setStatus(salesOrder.getStatus());
		storedSalesOrder.setShipToAddress(salesOrder.getShipToAddress());

		salesOrderRepository.save(salesOrder);
	}

	@Override
	public void deleteSalesOrder(String id) {
		salesOrderRepository.delete(salesOrderRepository.findById(id).orElseThrow(() ->
				new ResponseError(HttpStatus.NOT_FOUND, "Pedido de venda não encontrado")));
	}
	
}
