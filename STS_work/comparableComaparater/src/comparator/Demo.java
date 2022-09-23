package comparator;

import java.util.PriorityQueue;
import java.util.Queue;

public class Demo {

	public static void main(String[] args) {

		Queue<Student> q = new PriorityQueue<>(new StudentComp());
		
		q.offer(new Student(10, "sab", 100));
		q.offer(new Student(20, "aab", 500));
		q.offer(new Student(30, "rab", 100));
		q.offer(new Student(40, "zab", 300));
		q.offer(new Student(50, "dab", 200));

		Student i;
		while((i = q.poll())!= null) {
			System.out.println(i);
		}
		
	}

}
