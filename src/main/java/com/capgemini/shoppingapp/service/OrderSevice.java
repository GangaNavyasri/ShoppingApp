package com.capgemini.shoppingapp.service;

import java.util.List;

import com.capgemini.shoppingapp.entities.Order;

public interface OrderSevice {
	public Order getOrder(int orderId);

	public Order submitOrder(Order order);

	public List<Order> getAllOrders();

	public Order deleteOrder(int orderId);

	public Order updateOrder(Order order);

	public Order cancelOrder(int orderId);

}
