package com.mycompany.library;

import com.mycompany.library.dao.AdultUser;
import com.mycompany.library.dao.KidUser;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		kidsExample();
		System.out.println("\n");
		System.out.println("\n");
		adultExample();

	}

	public static void kidsExample() {
		KidUser timmy = new KidUser();
		KidUser billy = new KidUser();

		timmy.setAge(10);
		System.out.printf("timmy: ");
		timmy.registerAccount();

		System.out.printf("timmy: ");
		timmy.setBookType("Kids");
		timmy.requestBook();

		billy.setAge(18);
		System.out.printf("Billy: ");
		billy.registerAccount();

		System.out.printf("Billy: ");
		billy.setBookType("Fiction");
		billy.requestBook();
	}

	public static void adultExample() {

		AdultUser john = new AdultUser();
		AdultUser robert = new AdultUser();

		john.setAge(5);
		System.out.printf("John: ");
		john.registerAccount();

		System.out.printf("John: ");
		john.setBookType("Kids");
		john.requestBook();

		robert.setAge(23);
		System.out.printf("Robert: ");
		robert.registerAccount();

		System.out.printf("Robert: ");
		robert.setBookType("Fiction");
		robert.requestBook();
		
	}

}
