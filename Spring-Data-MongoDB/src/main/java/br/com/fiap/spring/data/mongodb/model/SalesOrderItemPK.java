package br.com.fiap.spring.data.mongodb.model;

import java.io.Serializable;

public class SalesOrderItemPK implements Serializable {

	private static final long serialVersionUID = 1L;

	private SalesOrder salesOrder;

	private Product product;

	public SalesOrderItemPK(SalesOrder salesOrder, Product product) {
		super();
		this.salesOrder = salesOrder;
		this.product = product;
	}

	public SalesOrderItemPK() {
	}

	public SalesOrder getSalesOrder() {
		return salesOrder;
	}

	public void setSalesOrder(SalesOrder salesOrder) {
		this.salesOrder = salesOrder;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
