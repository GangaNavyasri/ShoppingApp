package com.capgemini.shoppingapp.entities;

public class Customer {
	private int customerId;
	private String customerPassword;
	private String firstName;
	private String lastName;
	private String email;
	private long contact;
	private Address address;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerId, String customerPassword, String firstName, String lastName, String email,
			long contact, Address address) {
		super();
		this.customerId = customerId;
		this.customerPassword = customerPassword;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contact = contact;
		this.address = address;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "CustomerEntity [customerId=" + customerId + ", customerPassword=" + customerPassword + ", firstName="
				+ firstName + ", lastName=" + lastName + ", email=" + email + ", contact=" + contact + ", address="
				+ address + "]";
	}
	
	
}
