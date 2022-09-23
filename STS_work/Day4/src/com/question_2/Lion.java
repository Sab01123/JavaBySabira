package com.question_2;

public class Lion {
	 String name;
	 boolean isHungry;
	 int age;
	 static int totalDeaths;
	 static void printKillings() {
		 System.out.println("Total killings by lions in jungle = "+ totalDeaths);
	 }
	void thinking(){
		 if(isHungry==true && age<=12 && age >=2)
		{
			totalDeaths = totalDeaths +1;
			System.out.println(name + " has eaten one animals");
		}
		 else if(isHungry==true && age>12)
		{
			totalDeaths = totalDeaths+2;
			System.out.println(name + " has eaten two animals");
		}
		
		else if(isHungry==true && age<2)
		{
			System.out.println(name + " is calling Mom");
		}
		else if(isHungry==false) 
		 {
			 System.out.println(name + " is sleeping");
		 }
		
	 }

	public static void main(String[] args) {
		Lion obj1 = new Lion();
		obj1.name = "lion_1";
		obj1.isHungry = true;
		obj1.age = 12;
		obj1.thinking();
		Lion obj2 = new Lion();
		obj2.name = "lion_2";
		obj2.isHungry = false;
		obj2.age = 25;
		obj2.thinking();
		Lion obj3 = new Lion();
		obj3.name = "lion_3";
		obj3.isHungry = true;
		obj3.age = 30;
		obj3.thinking();
		printKillings();
	}
}
