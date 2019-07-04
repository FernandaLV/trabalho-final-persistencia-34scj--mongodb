package br.com.fiap.springdatajpa.model;

import java.io.Serializable;

public class SalesOrderItemPK implements Serializable {

	private static final long serialVersionUID = 1L;

	private SalesOrder salesOrder;

	private Inventory inventory;

	public SalesOrderItemPK(SalesOrder salesOrder, Inventory inventory) {
		super();
		this.salesOrder = salesOrder;
		this.inventory = inventory;
	}

	public SalesOrderItemPK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalesOrder getSalesOrder() {
		return salesOrder;
	}

	public void setSalesOrder(SalesOrder salesOrder) {
		this.salesOrder = salesOrder;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

}
