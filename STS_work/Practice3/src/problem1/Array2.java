package problem1;

public class Array2 {

	public static void main(String[] args) {

		////compute sum and average
		int [] arr = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
//		int [] arr = {1,2,3};
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		double avarage = (double)sum/arr.length;
		System.out.println(sum);
		System.out.println(avarage);
	}

}
