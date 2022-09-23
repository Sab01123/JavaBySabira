package com.question_4;

public class Test implements Intr {

	@Override
	public int[] display(int p) {
	
		int [] arr = new int[p+1];
		
		
		for(int i = 2; i<=p; i++) {
		int c = 0;
		for(int j =2; j<i; j++) {
			if(i%j==0) {
				c++;
			}
		}
		if(c==0) {
			arr[i] =i;
		}
	}
	
	return arr;
		
		
		
		
	
//		int c2 = 0;
//		for(int i =2; i<=p; i++) {
//			int c = 0;
//			for(int j = 2; j<= Math.pow(p, 0.5); j++ ) {
//				if(i%j==0) {
//					c++;
//					break;
//					
//				}
//			}
//			
//			if(c==0) {
//				arr[c2] = i;
////				arr[i]=i;
////				System.out.println(i);
//				c2++;
//				}
//		}
//		
//		return arr;
		

	   }  
		
	}


