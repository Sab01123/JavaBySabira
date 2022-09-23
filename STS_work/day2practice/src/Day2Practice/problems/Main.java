package Day2Practice.problems;

public class Main {
public static void main(String[] args) {
	//if_else condition
	/*int i = 50;
	int j;
	if(i==10)
	{
		j=20;
	}
	else if(i==20)
	{
		j=30;
	}
	else {
		j=40;
	}
	System.out.println(j);*/
//switch case
	/*int i = 5;
	switch(i) {
	case 1:
		System.out.println("one");
		break;
	case 2:
		System.out.println("two");
		break;
	case 3:
		System.out.println("three");
		break;
	case 4:
		System.out.println("four");
		break;
	case 5:
		System.out.println("five");
		break;
	default: System.out.println("default");
	}*/
//forloop
	/*int n=10;
	for(int i=0; i<n; i++) {
		System.out.println(i);
	}*/
//	nestedloop
	/*int n = 3;
	int m = 5;
	for(int i =0; i<n; i++) {
		
		for(int j=0; j<m; j++) {
			System.out.println("*");
		}
	}*/
//whileloop
	/*int i = 0;
	while(i<10) {
		System.out.println(i);
		i++;
	}*/
//	doloop
	/*int i = 0;
	do {
		System.out.println(i);
		i++;
	}
	while(i<10);*/
	
//break;
	/*for(int i = 0; i<10; i++)
	{
		if(i==5)
		{
			break;
		}
		System.out.println(i);
	}*/
//continue
	/*for(int i = 0; i<10; i++)
	{
		if(i==5)
		{
			continue;
		}
		System.out.println(i);
	}*/
//nestedloop with break
	/*int sum = 0;
	for(int i=0; i<5; i++)
	{
		for(int j=0; j<10; j++)
		{
			if(j==5)
			{
				break;
			}
			sum = sum+j;
		}
	}
	System.out.println(sum);
	*/
	/*int num = 10;
	for(int i=0; i<num; i++)
	{
		if(i%2==0)
		{
			continue;
		}
		System.out.println(i);
	}*/
	/*for(int i=0; i<5; i++)
	{
		for(int j=0; j<5; j++)
		{
			if(i==2)
			{
				continue;
			}
			System.out.println(i+" "+j);
		}
		
	}*/
	
//	int marks = 500;
//	if(marks>600)
//	{
//		System.out.println("first division");
//	}
//	else {
//		System.out.println("second div");
//	}
	
//	int marks = 500;
//	String result = ("first division");
//	if(marks<600)
//	{
//		result = ("second division");
//	}
//	System.out.println(result);
	
	int marks = 500;
	String result = (marks>600)? "first division":"second division";
	System.out.println(result);
	
}
}
