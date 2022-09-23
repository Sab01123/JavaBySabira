package com.question_2;


public class Main {

	public static void main(String[] args) {

	//Predicate	
		Predicate<StudentBean> p1 = s-> s.getMarks()>500; 
		
		System.out.println(p1.test(new StudentBean(11, "sabira", 600)));//True
		System.out.println(p1.test(new StudentBean(12, "zainab", 200)));//False
		
		System.out.println("----------------------");
		
		//Consumer
Consumer<StudentBean> c = s2-> {
	System.out.println(s2.getRoll());
	System.out.println(s2.getName());
	System.out.println(s2.getMarks());
	System.out.println("****************");
};

c.accept(new StudentBean(1, "haleef", 300));
c.accept(new StudentBean(2, "muntazir", 500));
c.accept(new StudentBean(3, "hafira", 400));

System.out.println("----------------------");

       //Supplier
Supplier<StudentBean> sup = ()->new StudentBean(4, "aaa", 340);
		System.out.println(sup.get());
		
		System.out.println("----------------------");

		//Function
		Function<StudentBean, String> fun = a-> a.getMarks()>500?"Pass":"Fail";
		System.out.println(fun.apply(new StudentBean(12, "Sabira Farooq", 700)));
		System.out.println(fun.apply(new StudentBean(22, "shifeen majeed", 400)));

	}

}
