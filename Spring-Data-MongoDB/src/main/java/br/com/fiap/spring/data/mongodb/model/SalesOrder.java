package br.com.fiap.spring.data.mongodb.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import br.com.fiap.spring.data.mongodb.model.enums.SalesOrderStatus;
import org.springframework.data.annotation.Id;

public class SalesOrder {

	@Id
	private String id;

	private Customer customer;

	private Date createdDate;

	private SalesOrderStatus status;

	private Address shipToAddress;

	private Set<SalesOrderItem> itens = new HashSet<>();

	public SalesOrder(Customer customer, Date createdDate, SalesOrderStatus status, Address shipToAddress) {
		this.customer = customer;
		this.createdDate = createdDate;
		this.status = status;
		this.shipToAddress = shipToAddress;
	}

	public SalesOrder(Customer customer, Date createdDate, SalesOrderStatus status, Address shipToAddress,
					  Set<SalesOrderItem> itens) {
		this.customer = customer;
		this.createdDate = createdDate;
		this.status = status;
		this.shipToAddress = shipToAddress;
		this.itens = itens;
	}

	public SalesOrder(String id, Customer customer, Date createdDate, SalesOrderStatus status, Address shipToAddress,
			Set<SalesOrderItem> itens) {
		this.id = id;
		this.customer = customer;
		this.createdDate = createdDate;
		this.status = status;
		this.shipToAddress = shipToAddress;
		this.itens = itens;
	}	

	public SalesOrder() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public SalesOrderStatus getStatus() {
		return status;
	}

	public void setStatus(SalesOrderStatus status) {
		this.status = status;
	}

	public Address getShipToAddress() {
		return shipToAddress;
	}

	public void setShipToAddress(Address shipToAddress) {
		this.shipToAddress = shipToAddress;
	}

	public Set<SalesOrderItem> getItens() {
		return itens;
	}

	public void setItens(Set<SalesOrderItem> itens) {
		this.itens = itens;
	}

}
