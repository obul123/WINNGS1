package com.wings.WINGS1.entities;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.swagger.v3.oas.annotations.Hidden;

@Entity
public class Customer01 {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Hidden
	private int customerId;
	@NotBlank
	private String Name;
	@NotNull
	private int IdType;
	@Id
	private String IdentifierValue;
	private String Address;
	private int PhNumber;

	public Customer01() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer01(int customerId, @NotBlank String name, @NotNull int idType, String identifierValue,
			String address, int phNumber) {
		super();
		this.customerId = customerId;
		Name = name;
		IdType = idType;
		IdentifierValue = identifierValue;
		Address = address;
		PhNumber = phNumber;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getIdType() {
		return IdType;
	}

	public void setIdType(int idType) {
		IdType = idType;
	}

	public String getIdentifierValue() {
		return IdentifierValue;
	}

	public void setIdentifierValue(String identifierValue) {
		IdentifierValue = identifierValue;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getPhNumber() {
		return PhNumber;
	}

	public void setPhNumber(int phNumber) {
		PhNumber = phNumber;
	}

	@Override
	public String toString() {
		return "Customer01 [customerId=" + customerId + ", Name=" + Name + ", IdType=" + IdType + ", IdentifierValue="
				+ IdentifierValue + ", Address=" + Address + ", PhNumber=" + PhNumber + "]";
	}

}
