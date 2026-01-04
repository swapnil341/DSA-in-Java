import java.util.Scanner;

public class FirstOccurence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index, target;
		 System.out.println("Enter the size of the array: ");
		 int n = sc.nextInt();
		 int[] arr = new int[n];
		 for(int j = 0; j < n ; j++)
			 arr[j] = sc.nextInt();
		 System.out.println("Target: ");
		 target = sc.nextInt();
		 index = firstOccurence(arr,n,0,target);
		 if(index == -1)
			 System.out.println("Target "+target+" does not exist in the array");
		 else
			 System.out.println("First occurence of "+target+" is on index "+index);
	}
	
	public static int firstOccurence(int[] arr,int n,int i,int target) {
		if(i == n)
			return -1;
		
		if(arr[i] == target)
			return i;
		return firstOccurence(arr,n,i+1,target);
	}
}
