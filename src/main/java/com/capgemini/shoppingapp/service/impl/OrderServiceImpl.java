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
		return orderRepository.save(order);
		
	}

	@Override
	public void deleteOrder(int orderId) {
     orderRepository.deleteById(orderId);
	}

	@Override
	public Order cancelOrder(int orderId) {
		Optional<Order> optionalOrder = orderRepository.findById(orderId);
		if(optionalOrder.isPresent())
		optionalOrder.get().setStatus("Cancelled");
		return orderRepository.save(optionalOrder.get());
		
	}

	@Override
	public Order updateOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

}
