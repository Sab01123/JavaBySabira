package functionalProg;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

import lemdaExpWithReturn.Student;

public class PreDemo {

	public static void main(String[] args) {

	List<Student> l = new ArrayList<>();
	l.add(new Student(1, "sabira", 400));
	l.add(new Student(2, "aabira", 450));
	l.add(new Student(3, "zainab", 700));
	l.add(new Student(4, "babu", 800));
	l.add(new Student(5, "noor", 900));

//		l.forEach(i->System.out.println(i));
	l.removeIf(i-> i.getMarks()>500);
	l.forEach(s->System.out.println(s));
	
	
	Consumer<Student> c2 = new Consumer<Student>() {

		@Override
		public void accept(Student t) {
System.out.println(t.getMarks()+ " "+ t.getRoll()+" " + t.getName());
			
		}
	};
	
	c2.accept(new Student(10, "sab", 100));
	c2.accept(new Student(20, "aab", 500));
	c2.accept(new Student(30, "sss", 300));
	c2.accept(new Student(40, "ddd", 200));
	
	
//	Supplier<Student> sp = new Supplier<Student>() {
//
//		@Override
//		public Student get() {
//			// TODO Auto-generated method stub
//			return null;
//		}
//	};
		
	
	Supplier<Student> sp1 = () -> new Student(11, "sss", 220);
	System.out.println(sp1.get());
	}

}
