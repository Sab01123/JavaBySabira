package com.question_3;

public class Main {
	public int[] findAndReturnPrimeNumbers(int[] inArr){
		
		boolean  b = true;
		int c  = 0;
		int [] primeArr = new int[inArr.length];
		for(int i: inArr) {
			
			
			for(int j = 2; j<= Math.pow(i, 0.5); j++) {
				if(i%j==0) {
					b = false;
					}
				}
			if(b==true) {
				primeArr [c]= i;
				c++;
				
			}
			else {
				b= true;
			}
		}
		return primeArr;
	}
	public static void main(String[] args) {
           Main obj = new Main();
					int[] arr = {10,12,5,50,11,14,15};
					int [] a =  obj.findAndReturnPrimeNumbers(arr);
					if(a.length==0) {
						System.out.println("Prime number not found in the supplied Array");
					}
					else {
						for(int i:a) {
							if(i!=0)
							System.out.println(i+" is prime number");
						}
					}
		}

}
