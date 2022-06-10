package com.bridgelabz.day24;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class AddressBook2 {
	public static void main(String[] args) {
		System.out.println("Welcome to the Addres Book System");
		Collection<AddressBookUC2> c = new ArrayList<AddressBookUC2>();
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		int choise;
		do {
			System.out.println("1.CREATE CONTACT");
			System.out.println("Enter Your choise : ");
			choise = scan1.nextInt();

			switch(choise) {
			case 1:
				System.out.println("Enter First Name : ");
				String firstName = scan.nextLine();
				System.out.println("Enter Last Name : ");
				String lastName = scan.nextLine();
				System.out.println("Enter the Address : ");
				String address = scan.nextLine();
				System.out.println("Enter the State : ");
				String state = scan.nextLine();
				System.out.println("Enter the Zip Code : ");
				int zip = scan1.nextInt();
				System.out.println("Enter the Phone Number : ");
				long phoneNumber = scan1.nextLong();
				System.out.println("Enter the Email Address : ");
				String eMail = scan.nextLine();

				c.add(new AddressBookUC2(firstName, lastName, address, state, zip, phoneNumber, eMail));
				break;
			}
		}
		while(choise != 0);
	}
}


