package overriding;

public class Member {
	String Name;
	int Age;
	String Phone_number;
	String Address;
	Double Salary;

	void printSalary() {
		System.out.println("Salary of "+ Name+" "+ Salary);
	}
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String name, int age, String phone_number, String address, Double salary) {
		super();
		Name = name;
		Age = age;
		Phone_number = phone_number;
		Address = address;
		Salary = salary;
	}
	
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getPhone_number() {
		return Phone_number;
	}
	public void setPhone_number(String phone_number) {
		Phone_number = phone_number;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Double getSalary() {
		return Salary;
	}
	public void setSalary(Double salary) {
		Salary = salary;
	}
	
	@Override
	public String toString() {
		return "Member [Name=" + Name + ", Age=" + Age + ", Phone_number=" + Phone_number + ", Address=" + Address
				+ ", Salary=" + Salary + "]";
	}
	
}
