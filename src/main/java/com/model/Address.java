package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "addressTable")
public class Address {

	@Column(name="addressPer",updatable = true,nullable = true,insertable = true)
	private String address;
	
	@JoinColumn(name = "id" , insertable = false,updatable = false)
	private Integer personNumberFk;
	
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer id;
	
	public Address(String address, Integer personNumberFk, Integer id) {
		super();
		this.address = address;
		this.personNumberFk = personNumberFk;
		this.id = id;
	}

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Integer getPersonNumberFk() {
		return personNumberFk;
	}

	public void setPersonNumberFk(Integer integer) {
		this.personNumberFk = integer;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Address [address=" + address + ", personNumberFk=" + personNumberFk + ", id=" + id + ", addressPerm="
				+ "]";
	}

}
