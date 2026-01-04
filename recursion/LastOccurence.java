import java.util.Scanner;

public class LastOccurence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, target, index;
		System.out.print("Enter the size of the array: ");
		n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i =0; i< n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Target: ");
		target = sc.nextInt();
		sc.close();
		
		index = lastOccurence(arr, n-1, target );
		
		if(index == -1)
			System.out.println("Target "+target+" not found in the array!");
		else
			System.out.println("Last occurence of the target "+target+" is on index : "+index);
		
	}
	
	public static int lastOccurence(int[] arr, int i, int target) {
		if(i < 0)
			return -1;
		
		if(arr[i] == target)
			return i;
		
		return lastOccurence(arr, i-1, target);
	}

}
