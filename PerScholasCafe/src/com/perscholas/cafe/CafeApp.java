package com.perscholas.cafe;

import java.util.*;

public class CafeApp {

	public static void main(String[] args) {
		Product coffee = new Product("coffee", 1.00, "Yummy Coffee");
		Product espresso = new Product("espresso", 2.00, "Strong espresso");
		Product cappuccino = new Product("cappuccino", 3.00, "Dope cappuccino");
		int quantity;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter quanity for coffee");
		quantity = sc.nextInt();
		coffee.setQuantity(quantity);
		
		System.out.println("Enter quanity for espresso");
		quantity = sc.nextInt();
		espresso.setQuantity(quantity);
		
		System.out.println("Enter quanity for cappuccino");
		quantity = sc.nextInt();
		cappuccino.setQuantity(quantity);
	}

}
