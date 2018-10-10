package com.capgemini.shoppingapp.controller;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.shoppingapp.entities.Item;
import com.capgemini.shoppingapp.entities.Order;
import com.capgemini.shoppingapp.service.OrderSevice;

@RestController
public class OrderController {
	@Autowired
	private OrderSevice orderSevice;

	private HashMap<Integer, Set<Item>> Items;

	public OrderController() {
		Items = new HashMap<>();
	}

	@PostMapping("/cart/{customerId}")
	public ResponseEntity<Set<Item>> addToCart(@RequestBody Item item, @PathVariable int customerId) {
		Set<Item> sampleItem = Items.get(customerId);
		if (sampleItem == null) {
			sampleItem = new HashSet<>();
			sampleItem.add(item);
			Items.put(customerId, sampleItem);
		} else {
			sampleItem.add(item);
			Items.put(customerId, sampleItem);
		}
		return new ResponseEntity<Set<Item>>(sampleItem, HttpStatus.OK);
	}


	@PostMapping("/order")
	public ResponseEntity<Order> submitOrder(@RequestBody Order order) {
		ResponseEntity<Order> responseEntity = new ResponseEntity<Order>(orderSevice.submitOrder(order),
				HttpStatus.OK);
		return responseEntity;
	}
}
