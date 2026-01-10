import java.util.Scanner;
public class ClearRangeOfBits {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Number: ");
            int no = sc.nextInt();
            System.out.print("From: ");
            int i = sc.nextInt();
            System.out.print("To: ");
            int j = sc.nextInt();
            int res = clearRangeOfBits(no, i, j);
            System.out.println("Before clearing bits: "+no);
            System.out.println("After clearing bits: "+res);
        }
    }

    public static int clearRangeOfBits(int no,int i , int j){
        int bitMask = ~(0) << (j+1);
        int temp = ~(0) << i;
        temp = ~temp;
        bitMask = bitMask | temp;
        return no & bitMask;
    }
}