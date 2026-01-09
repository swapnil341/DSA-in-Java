import java.util.Scanner;
public class ClearLastIBits {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Number: ");
            int no = sc.nextInt();
            System.out.print("Last n bits to clear: ");
            int lastBits = sc.nextInt();
            int res = clearLastIBits(no, lastBits);
            System.out.println("Before clearing last "+ lastBits +"Number: "+no);
            System.out.println("After clearing last "+ lastBits +"Number: "+res);
        }
    }

    public static int clearLastIBits(int no, int lastBits){
        int bitMask = ~(0) << lastBits;
        return no & bitMask;
    }
}
