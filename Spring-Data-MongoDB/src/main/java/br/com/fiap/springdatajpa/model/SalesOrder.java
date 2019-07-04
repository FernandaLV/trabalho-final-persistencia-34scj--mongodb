package br.com.fiap.springdatajpa.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;

import br.com.fiap.springdatajpa.model.enums.SalesOrderStatus;

public class SalesOrder {

	@Id
	private Integer id;

	private Date createdDate;
	private Integer status;

	private Address shipToAddress;

	private Set<SalesOrderItem> itens = new HashSet<>();

	public SalesOrder(Integer id, Customer customer, Date createdDate, SalesOrderStatus status, Address shipToAddress,
			Set<SalesOrderItem> itens) {
		super();
		this.id = id;
		this.createdDate = createdDate;
		this.status = (status == null) ? null : status.getCode();
		this.shipToAddress = shipToAddress;
		this.itens = itens;
	}	

	public SalesOrder() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
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
