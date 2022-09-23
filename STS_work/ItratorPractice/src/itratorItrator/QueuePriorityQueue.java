package itratorItrator;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePriorityQueue {

	public static void main(String[] args) {

		Queue<Integer> q = new PriorityQueue<>();
		
		q.offer(10);
		q.offer(20);
		q.offer(50);
		q.offer(30);
		q.offer(15);
		q.offer(10);
		q.offer(40);
//
//	Iterator<Integer> itr =	q.iterator();
//		
//	while(itr.hasNext()) {
//	int i =	itr.next();
//	System.out.println(i);
//	}  
	//	output
//     10
//	   15
//	   10
//	   30
//	   20
//	   50
//	   40
	//sort
		
Integer i;

while((i = q.poll()) != null) {
	System.out.println(i);//in sorted order
}
	System.out.println(q);//[]
	



	}

}
