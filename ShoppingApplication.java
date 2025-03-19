package com.Shopping_Application.program;

public class ShoppingApplication {

	public static void main(String[] args) {
		try {
			// product added in cart
			Product product1 = new Product(1, "Laptop", 800, 5);
			Product product2 = new Product(2, "Phone", 500, 10);
			Product product3 = new Product(3, "Airbuds", 100, 15);

			// cart capacity, how many cartItems can add customer
			ShoppingCart cart = new ShoppingCart(10);

			// Add items in cart
			cart.addToCart(product1, 2);
			cart.addToCart(product2, 3);
			System.out.println("Total price: $"+cart.calculateTotal());

			// Insufficient quantity
			try {
				cart.addToCart(product3, 20);
			} catch (InsufficientQuantityException e) {
				System.out.println(e.getMessage());
			}
			
			// Invalid product
			try {
				cart.addToCart(null, 1);
			}
			catch(InvalidProductException e) {
				System.out.println(e.getMessage());
			}
			
			//Full Cart
			try {
				for(int i=0; i<8; i++) {
				cart.addToCart(product3, 1);
				}
			}
			catch(InvalidProductException e) {
				System.out.println(e.getMessage());
			}
			
			//calculate total with empty cart
			ShoppingCart emptyCart = new ShoppingCart(10);
			System.out.println("Total Price with Empty cart: $"+emptyCart.calculateTotal());
		}
		
		catch (Exception e) {
			System.out.println("An Unexpected error occured: " + e.getMessage());
		}
	}
}
