package recursion;
import java.util.Scanner;
public class SumOfNNaturalNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int sum = computeSum(n);
		System.out.println("Sum of "+n+" natural numbers are: "+ sum);
		sc.close();
	}

	public static int computeSum(int n){
		if(n == 0)
			return 0;
		return n + computeSum(n-1);
	}
}