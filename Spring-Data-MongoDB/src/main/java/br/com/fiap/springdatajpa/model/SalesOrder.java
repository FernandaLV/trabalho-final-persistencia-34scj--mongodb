package br.com.fiap.springdatajpa.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.fiap.springdatajpa.model.enums.SalesOrderStatus;

@Entity
@Table(name="sales_order")
public class SalesOrder {

	/**
	 * A tabela possui uma sequence para que sua chave sequencial não entre em conflitos com as demais chaves do banco
	 */
	@Id
	@GeneratedValue(generator = "generator", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(initialValue = 1, name = "generator", sequenceName = "sales_order_sequence")
	private Integer id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_id")
	private Customer customer;

	private Date createdDate;

	@Enumerated(EnumType.STRING)
	private SalesOrderStatus status;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ship_to_address_id")
	private Address shipToAddress;

	@OneToMany(mappedBy = "id.salesOrder", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
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

	public SalesOrder(Integer id, Customer customer, Date createdDate, SalesOrderStatus status, Address shipToAddress,
			Set<SalesOrderItem> itens) {
		super();
		this.id = id;
		this.customer = customer;
		this.createdDate = createdDate;
		this.status = status;
		this.shipToAddress = shipToAddress;
		this.itens = itens;
	}	

	public SalesOrder() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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
