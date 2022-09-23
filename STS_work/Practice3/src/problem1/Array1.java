package problem1;

public class Array1 {

	public static void main(String[] args) {
		
    int [] arr = {10,20,30,40,50};
//        \\one way
//    System.out.println("First Element :" + arr[0]);
//    
//    System.out.println("second Element :" + arr[1]);
//
//    System.out.println("thrid Element :" + arr[2]);
//
//    System.out.println("fourth Element :" + arr[3]);
//
//    System.out.println("fifth Element :" + arr[4]);
    
         //for loop
//    for(int i = 0; i<arr.length; i++) {
//    	System.out.println(arr[i]);
//    }
    
    //for each
    for(int i : arr) {
    	System.out.println(i);
    }

	}

}
