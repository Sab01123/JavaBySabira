package collectionsArrays;

import java.util.Arrays;

public class ArraysToString {

	public static void main(String[] args) {
		
		
//		int [] arr = {10,20,15,30,50,35,40};
//		System.out.println(arr);//[I@75a1cd57
//		
//	String newArr =	Arrays.toString(arr);
//System.out.println(newArr);
//output[10, 20, 15, 30, 50, 35, 40]

//sort arr
		
//		int [] arr = {10,20,15,30,50,35,40};
//	
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
////output [10, 15, 20, 30, 35, 40, 50]

		
//searching an element in array:		
//		int [] arr = {10,20,15,30,50,35,40};
//		Arrays.sort(arr);
////		System.out.println(Arrays.toString(arr));
////		[10, 15, 20, 30, 35, 40, 50]
//		
//    int index =    Arrays.binarySearch(arr, 15);
//
//    System.out.println(index);  //1
		
		
		int [] arr = {10,20,15,30,50,35,40};

		Arrays.sort(arr);
	int number	= Arrays.binarySearch(arr, 15);
		System.out.println(arr[number]); // 15
   
	}

}
