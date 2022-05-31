package com.BridgeLabz_WorkShop4;

public class AddressBookUC1 {
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	int zip;
	long phNo;
	String eMail;

	AddressBookUC1(String firstName,String lastName,String address,String city,String state,int zip,long phNo,String eMail){
		this.firstName=firstName;
		this.lastName=lastName;
		this.address=address;
		this.city=city;
		this.state=state;
		this.zip=zip;
		this.phNo=phNo;
		this.eMail=eMail;
	}

	public String toString(){
		return "First Name is " + firstName + "\n" + "Last Name is " + lastName + "\n " + "Address is " + address +
				"\n" + "City is " + city + "\n" + "State is " + state + "\n" + "Zip Number is " + zip + "\n" + "Phone Number is "
				+ phNo + "\n" + " Email " + eMail ;
	}
}
