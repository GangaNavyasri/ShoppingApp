package com.capgemini.shoppingapp.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.shoppingapp.entities.Order;
import com.capgemini.shoppingapp.repository.OrderRepository;
import com.capgemini.shoppingapp.service.OrderSevice;
@Service
public class OrderServiceImpl implements OrderSevice {
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Order getOrder(int orderId) {
		Optional<Order> optionalOrder = orderRepository.findById(orderId);
		return optionalOrder.get();
	}

	@Override
	public Order submitOrder(Order order) {
		return order;
		
	}

	@Override
	public void deleteOrder(int orderId) {
     orderRepository.deleteById(orderId);
	}

	@Override
	public void cancelOrder(int orderId) {
		// TODO Auto-generated method stub
		
	}

}
