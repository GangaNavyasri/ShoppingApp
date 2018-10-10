package com.capgemini.shoppingapp.entities;

import java.util.HashMap;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="product")
public class Product {
	@Id
	private int productId;
	private String productName;
	private String productCategory;
	private double productPrice;
	HashMap<String, Object>Specifications= new HashMap<>();
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productName, String productCategory, double productPrice,
			HashMap<String, Object> specifications) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
		Specifications = specifications;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public HashMap<String, Object> getSpecifications() {
		return Specifications;
	}

	public void setSpecifications(HashMap<String, Object> specifications) {
		Specifications = specifications;
	}
	
}
