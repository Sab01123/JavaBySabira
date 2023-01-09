package com.masai;

public class PartTimeExmployee {

	private int salaryPerHour;
	private int consultant_code;

}
//e (salaryPerHour, consultant_code) - This should not be able to
//be serialized. If you try to serialize this object, it should throw NotSerializableException
