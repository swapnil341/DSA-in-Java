import java.util.Scanner;

public class RecursiveFactorial {
    public static int factorial(int no) {
        if (no == 0)
            return 1;
        return no * factorial(no - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.: ");
        int no = sc.nextInt();
        System.out.println("Factorial of " + no + " is : " + factorial(no));
    }
}
