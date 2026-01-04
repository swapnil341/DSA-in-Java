package recursion;

import java.util.Scanner;
public class CheckIfArraySortedOrNot {

	public static void main(String[] args) {
		int n = 0, i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		n = sc.nextInt();
		int[] arr = new int[n];
		for(int j = 0; j < n; j++) {
			arr[j] = sc.nextInt();
		}
		if(isSorted(arr,n,i))
			System.out.println("Given Array is Sorted");
		else
			System.out.println("Given Array is Not Sorted!");

	}
	
	public static boolean isSorted(int[] arr, int n, int i) {
		if(i >= n-1 )
			return true;
		
		if(arr[i] > arr[i+1])
			return false;
		
		return isSorted(arr,n,i+1);
	}

}
