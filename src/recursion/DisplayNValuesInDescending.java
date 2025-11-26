package recursion;

import java.util.Scanner;

public class DisplayNValuesInDescending {
    public static void printNo(int no) {
        if (no == 0)
            return;
        System.out.println(no);
        printNo(no - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.: ");
        int no = sc.nextInt();
        printNo(no);
    }
}
