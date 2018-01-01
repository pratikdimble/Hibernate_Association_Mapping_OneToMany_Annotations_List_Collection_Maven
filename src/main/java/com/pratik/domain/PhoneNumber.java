package com.pratik.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PhoneNumber_OTM7")
public class PhoneNumber {
	private long phone;
	private String numberType;
	private String operator;
	
	public PhoneNumber() {
		System.out.println("PhoneNumber:0-param constructor");
	}
	 @Id
	 @Column(name="PHONE")
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Column(name="TYPE")
	public String getNumberType() {
		return numberType;
	}
	public void setNumberType(String numberType) {
		this.numberType = numberType;
	}
	@Column(name="OPERATOR")
	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	@Override
	public String toString() {
		return "PhoneNumber [phone=" + phone + ", numberType=" + numberType + ", operator=" + operator + "]";
	}

}
