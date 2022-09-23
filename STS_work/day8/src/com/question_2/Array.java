package com.question_2;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Enter no of rows");
int rows = sc.nextInt();

System.out.println("Enter no of colunms");
int col = sc.nextInt();

int [][] arr = new int [rows][col];
System.out.println("Enter the elements of array");
for(int i = 0; i<rows; i++)
{
	for(int j = 0; j<col; j++)
	{
		arr[i][j] = sc.nextInt();
	}
}
     
for(int i = 0; i<rows; i++)
{
	int sum = 0;
	for(int j = 0; j<col; j++)
	{
		if(arr[j][i]%2==0)
		{
			sum += arr[j][i];
		}
	}
	System.out.println(sum);
}

	}
	}


//int[] arrr1 = {1,2,3};
//for(int i : arrr1)
//{
//	
//}


