package com.wings.WINGS1.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account01 {

	private int Id;
	private String IdentifierValue;
	@Id
	private String IBAN;

	public Account01() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account01(int id, String identifierValue, String iBAN) {
		super();
		Id = id;
		IdentifierValue = identifierValue;
		IBAN = iBAN;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getIdentifierValue() {
		return IdentifierValue;
	}

	public void setIdentifierValue(String identifierValue) {
		IdentifierValue = identifierValue;
	}

	public String getIBAN() {
		return IBAN;
	}

	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}

	@Override
	public String toString() {
		return "Account01 [Id=" + Id + ", IdentifierValue=" + IdentifierValue + ", IBAN=" + IBAN + "]";
	}

}
