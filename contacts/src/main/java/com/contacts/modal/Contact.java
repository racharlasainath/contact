package com.contacts.modal;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @ToString
public class Contact {
	private int Id;
	private String firstName;
	private String lastName;
	private long number;
	private String Email;
	private String DOB;
	private String address;
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(int id, String firstName, String lastName, long number, String email, String dOB, String address) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
		Email = email;
		DOB = dOB;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Contact [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", number=" + number
				+ ", Email=" + Email + ", DOB=" + DOB + ", address=" + address + "]";
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

	
}