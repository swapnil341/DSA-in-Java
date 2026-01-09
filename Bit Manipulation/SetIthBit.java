import java.util.Scanner;
public class SetIthBit {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Number: ");
            int no = sc.nextInt();
            System.out.print("Index: ");
            int i = sc.nextInt();
            int res = setIthBit(no,i);
            System.out.println("Before setting the "+i+" indexed bit : "+no);
            System.out.println("After setting the "+i+" indexed bit: "+res);
        }
    }    

    public static int setIthBit(int no, int index){
        int bitMask = 1 << index;
        return no | bitMask;
    }
}
