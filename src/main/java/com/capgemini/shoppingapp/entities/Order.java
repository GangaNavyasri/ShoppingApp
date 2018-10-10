package com.capgemini.shoppingapp.entities;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Document(collection="order")
public class Order {
	@Id
	private int orderId;
	private int customerId;
	private double totalAmount;
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private LocalDate date;
	private Item item;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int orderId, int customerId, double totalAmount, LocalDate date, Item item) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.totalAmount = totalAmount;
		this.date = date;
		this.item = item;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customerId=" + customerId + ", totalAmount=" + totalAmount + ", date="
				+ date + ", item=" + item + "]";
	}
	
    
	
	
}
