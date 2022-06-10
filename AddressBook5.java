package com.bridgelabz.day24;
import java.util.*;

public class AddressBook5 {
	public static void main(String[] args) {
		System.out.println("Welcome to the Addres Book System");
		Collection<AddressBookUC5> c = new ArrayList<AddressBookUC5>();
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		int choise;
		do {
			System.out.println("1.CREATE CONTACT");
			System.out.println("2.DISPLAY THE CONTACT");
			System.out.println("3.EDIT THE CONTACT");
			System.out.println("4.DELETE THE CONTACT");
			System.out.println("0.EXIT");
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


				c.add(new AddressBookUC5(firstName, lastName, address, state, zip, phoneNumber, eMail));
				break;
			case 2:
				Iterator<AddressBookUC5> i = c.iterator();
				while(i.hasNext()) {
					AddressBookUC5 e = i.next();
					System.out.println(e);
				}
				break;
			case 3:
				boolean found = false;
				System.out.print("Enter the Phone Number to Edit the contact: ");
				phoneNumber =  scan1.nextLong();
				ListIterator<AddressBookUC5> li = ((ArrayList<AddressBookUC5>) c).listIterator();
				while(li.hasNext()) {
					AddressBookUC5 e = li.next();
					if(e.getPhoneNumber() == phoneNumber) {
						System.out.print("Enter new First Name : ");
						firstName = scan.nextLine();
						System.out.print("Enter new Last Name : ");
						lastName = scan.nextLine();
						System.out.print("Enter the new Address : ");
						address = scan.nextLine();
						System.out.print("Enter the new State : ");
						state = scan.nextLine();
						System.out.print("Enter the Zip new Code : ");
						zip = scan1.nextInt();
						System.out.print("Enter the new Phone Number : ");
						phoneNumber = scan1.nextLong();
						System.out.print("Enter the new Email Address : ");
						eMail = scan.nextLine();
						li.set(new AddressBookUC5(firstName, lastName , address, state, zip, phoneNumber, eMail));
						found = true;
					}
				}
				if(!found) {
					System.out.println("Record not found");	
				}else {
					System.out.println("Record is Updated successfuly");	
				}
				break;
			case 4:
				found = false;
				System.out.print("Enter the Phone Number to Delete : ");
				phoneNumber = scan1.nextLong();
				i = c.iterator();
				while(i.hasNext()) {
					AddressBookUC5 e = i.next();
					if(e.getPhoneNumber() == phoneNumber) {
						i.remove();
						found = true;
					}
				}
				if(!found) {
					System.out.println("Record not found");	
				}else {
					System.out.println("Record is deleted successfuly");	
				}
				break;
			}
		}while(choise != 0);
	}
}

