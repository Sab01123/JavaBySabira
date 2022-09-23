package com.question_1;

public class Address {
String city;
String	state;
String pinCode;
	
public Address() {
	// TODO Auto-generated constructor stub
}

public Address(String city, String state, String pinCode) {
	super();
	this.city = city;
	this.state = state;
	this.pinCode = pinCode;
}

@Override
public String toString() {
	return "Address [city=" + city + ", state=" + state + ", pinCode=" + pinCode + "]";
}


}
