package com.BridgeLabz_WorkShop4;

import java.util.ArrayList;
import java.util.*;

public class MainClass {
	static ArrayList<AddressBookUC1> array = new ArrayList<AddressBookUC1>();

	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter the First name");
		String firstName= scanner.next();
		System.out.println("enter the last name");
		String lastName= scanner.next();
		System.out.println("enter the Address name");
		String address= scanner.next();
		System.out.println("enter the City name");
		String city= scanner.next();
		System.out.println("enter the State name");
		String state= scanner.next();
		System.out.println("enter the Zip name");
		int zip= scanner.nextInt();
		System.out.println("enter the Phone name");
		long phNo= scanner.nextLong();
		System.out.println("enter the Email name");
		String eMail= scanner.next();

		array.add(new AddressBookUC1(firstName,lastName,address,city,state,zip,phNo,eMail) );

		Iterator<AddressBookUC1> iterator = array.iterator();
		while(iterator.hasNext()) {
			AddressBookUC1 details = iterator.next();
			System.out.println(details);
		}
	}
}


