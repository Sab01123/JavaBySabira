package comparator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;

public class QueueLinkedList {

	public static void main(String[] args) {

		Queue<Student> q = new LinkedList<>();
		q.offer(new Student(1, "sab", 300));
		q.offer(new Student(2, "zab", 500));
		q.offer(new Student(3, "aab", 450));

//		System.out.println(q);
//		for(Student i:q) {
//			System.out.println(i);
//		}
//		
		
//Iterator<Student> s = q.iterator();		
//
//while(s.hasNext()) {
//Student st	= s.next();
//System.out.println(st);
//}
//		Student i;
//while((i=q.poll())!=null) {
//	System.out.println(i);
//}
	
		
	}

}
