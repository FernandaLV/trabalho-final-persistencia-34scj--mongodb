package br.com.fiap.spring.data.mongodb.model;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Customer {

	@Id
	private String id;

	private String name;
	private String surname;
	private Date birthDate;
	private char gender;

	private Set<Address> address = new HashSet<>();

	private Set<String> phones = new HashSet<>();

	public Customer() {
	}

	public Customer(String name, String surname, Date birthDate, char gender, Set<String> phones) {
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.gender = gender;
		this.phones = phones;
	}

	public Customer(String name, String surname, Date birthDate, char gender, Set<Address> address,
					Set<String> phones) {
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.gender = gender;
		this.address = address;
		this.phones = phones;
	}

	public Customer(String id, String name, String surname, Date birthDate, char gender, Set<Address> address,
					Set<String> phones) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.gender = gender;
		this.address = address;
		this.phones = phones;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Set<Address> getAddress() {
		return address;
	}

	public void setAddress(Set<Address> address) {
		this.address = address;
	}

	public Set<String> getPhones() { return phones; }

	public void setPhones(Set<String> phones) { this.phones = phones; }

}
