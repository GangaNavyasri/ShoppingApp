package com.capgemini.shoppingapp.service;

import com.capgemini.shoppingapp.entities.Order;

public interface OrderSevice {
	public Order getOrder(int orderId);

	public Order submitOrder(Order order);

	public void deleteOrder(int orderId);
	public Order updateOrder(Order order);

	public Order cancelOrder(int orderId);

}
