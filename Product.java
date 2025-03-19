package com.Shopping_Application.program;

public class Product {
public int id;
public String productName;
public double productPrice;
public int quantity;
public Product(int id, String productName, double productPrice, int quantity) {
	super();
	this.id = id;
	this.productName = productName;
	this.productPrice = productPrice;
	this.quantity = quantity;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}

public double getProductPrice() {
	return productPrice;
}

public void setProductPrice(double productPrice) {
	this.productPrice = productPrice;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public void decreaseQuantity(int quantity ) throws InsufficientQuantityException {
	if(this.quantity<quantity) {
		throw new InsufficientQuantityException("Insufficient Quantiity is not available : "+ getProductName()); 
	}
	this.quantity -= quantity;
}
}
