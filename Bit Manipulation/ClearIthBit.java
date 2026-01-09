import java.util.Scanner;
public class ClearIthBit {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Number: ");
            int no = sc.nextInt();
            System.out.print("Index: ");
            int i = sc.nextInt();
            int res = clearIthBit(no,i);
            System.out.println("Before clearing the "+i+" indexed bit : "+no);
            System.out.println("After clearing the "+i+" indexed bit: "+res);
        }
    }    

    public static int clearIthBit(int no , int i){
        int bitMask = 1 << i;
        bitMask = ~bitMask;
        return no & bitMask;
    }
}





