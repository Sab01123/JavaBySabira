package com.question_4;

public class Java {
	
  void check(int n) {
	  if(n<0)
	  {
		  System.out.println("Error");
	  }
	  else if(n%2!=0)
	  {
		  System.out.println(n);
	  }
	  else if(n%2==0)
	  {
		  while(true) {
			  n++;
			  if(n%10==0)
			  {
				  System.out.println(n);
				  break;
			  }
		  }
	  }
	  
  }
	public static void main(String[] args) {
     new Java().check(26);
	}

}
