package overriding;

public class Member_Main {

	public static void main(String[] args) {
Employee e = new Employee();
Manager m  = new Manager();
     
e.Name = "sabira";
e.Age = 25;
e.Phone_number = "111111";
e.Address = "Delhi";
e.Salary = (double)80000;

m.Name = "Farooq";
m.Age = 55;
m.Phone_number = "222222";
m.Address = "Srinagar";
m.Salary = (double)40000;
System.out.println(e);
System.out.println(m);
e.printSalary();
m.printSalary();
	}

}
/*Now, create a Main class which has the main method in it and assign name, age, phone
number, address and salary to an employee and a manager by making an object of both of these
classes and print the same.*/