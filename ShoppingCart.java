package com.Shopping_Application.program;

public class ShoppingCart {
	int itemCount;
	Product[] cartItems;
	int capacity;

	public ShoppingCart(int capacity) {
		super();
		this.cartItems = new Product[capacity];
		this.itemCount = 0;
	}

	public void addToCart(Product product, int quantity) throws InvalidProductException, InsufficientQuantityException {
		if (product == null) {
			throw new InvalidProductException("Product not found.");
		}

		if (itemCount >= cartItems.length) {
			throw new InvalidProductException("Cart is full. Cannot add more products.");
		}
		product.decreaseQuantity(quantity);
		cartItems[itemCount++] = product;
	}

	public double calculateTotal() {
		double total = 0.0;
		for(int i=0; i<itemCount; i++) {
			total += cartItems[i].getProductPrice() * cartItems[i].getQuantity();
		}
		return total;
	}
}
