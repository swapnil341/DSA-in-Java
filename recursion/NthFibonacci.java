import java.util.Scanner;
public class NthFibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number: ");
		int n = sc.nextInt();
		int result = calFibonacci(n);
		System.out.println(n+"th Fibonacci number is: "+result);

	}
	
	public static int calFibonacci(int no){
		if(no == 1)	return 1;
		if(no == 0) return 0;
		return calFibonacci(no - 1) + calFibonacci(no - 2);
	}

}
