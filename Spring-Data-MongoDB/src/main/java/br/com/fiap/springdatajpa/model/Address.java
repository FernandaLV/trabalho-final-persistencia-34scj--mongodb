package br.com.fiap.springdatajpa.model;

import org.springframework.data.annotation.Id;

import br.com.fiap.springdatajpa.model.enums.AddressType;

public class Address {

	@Id
	private Integer id;

	private String street;
	private Integer number;
	private String complement;
	private String postalCode;
	private String city;
	private String province;
	private String country;

	private Integer type;

	public Address(){}

	public Address(String street, Integer number, String complement, String postalCode, String city,
				   String province, String country, AddressType type) {
		super();
		this.street = street;
		this.number = number;
		this.complement = complement;
		this.postalCode = postalCode;
		this.city = city;
		this.province = province;
		this.country = country;
		this.type = (type == null) ? null : type.getCode();
	}

	public Address(Integer id, String street, Integer number, String complement, String postalCode, String city,
				   String province, String country, Customer cliente, AddressType type) {
		super();
		this.id = id;
		this.street = street;
		this.number = number;
		this.complement = complement;
		this.postalCode = postalCode;
		this.city = city;
		this.province = province;
		this.country = country;
		this.type = (type == null) ? null : type.getCode();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public AddressType getType() {
		return AddressType.toEnum(type);
	}

	public void setType(AddressType type) {
		this.type = type.getCode();
	}
	
	
	
	

}
