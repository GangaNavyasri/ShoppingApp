package com.capgemini.shoppingapp.service.impl;

import java.util.List;
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
	public Order deleteOrder(int orderId) {
		Optional<Order> optionalOrder = orderRepository.findById(orderId);
		if(optionalOrder.isPresent())
		optionalOrder.get().setStatus("Deleted");
		return orderRepository.save(optionalOrder.get());
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
		Optional<Order> optionalOrder = orderRepository.findById(order.getOrderId());
		if(optionalOrder.isPresent())
			optionalOrder.get().setStatus("Updated");
			return orderRepository.save(optionalOrder.get());
	}

	@Override
	public List<Order> getAllOrders() {
		return orderRepository.findAll();
	}

}
