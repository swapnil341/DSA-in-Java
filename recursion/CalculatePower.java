import java.util.Scanner;
public class CalculatePower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,n;
		System.out.print("Enter base : ");
		x = sc.nextInt();
		
		System.out.print("Enter power: ");
		n = sc.nextInt();
		
		System.out.println("power : "+pow(x,n));

	}
	
	public static int pow(int x, int n) {
		if(n == 0)
			return 1;
		int halfPow = pow(x,n/2);
		int halfPowSquare = halfPow * halfPow;
		if(n % 2 != 0) {
			return x * halfPowSquare;
		}
		return halfPowSquare ;
	}

}
