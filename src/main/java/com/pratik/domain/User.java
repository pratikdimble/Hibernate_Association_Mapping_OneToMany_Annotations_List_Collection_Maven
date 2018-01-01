package com.pratik.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.ListIndexBase;

@Entity
@Table(name="User_OTM7")
public class User {
	private int userId;
	private String firstName;
	private List<PhoneNumber> phones;
	
	 public User() {
		System.out.println("User:0-param constructor");
	}
	 @Id
	 @Column(name="USERID")
	 @GenericGenerator(name="increment",strategy="increment")
	 @GeneratedValue(generator="increment")
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Column(name="FIRSTNAME")
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@OneToMany(targetEntity=PhoneNumber.class,
			cascade=CascadeType.ALL,
			fetch=FetchType.LAZY,
			orphanRemoval=true)
@JoinColumn(name="unid",referencedColumnName="userId")
	@OrderColumn(name="INDEX")
	@ListIndexBase(value=1)
	public List<PhoneNumber> getPhones() {
		return phones;
	}
	public void setPhones(List<PhoneNumber> phones) {
		this.phones = phones;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName+"\n" ;
	}
}
