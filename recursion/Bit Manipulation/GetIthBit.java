import java.util.Scanner;
public class GetIthBit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int no = sc.nextInt();
        System.out.print("Index: ");
        int i = sc.nextInt();
        System.out.println(i + " indexed bit of number "+no+" is "+ (getIthBit(no, i) ? "1" : "0"));
        sc.close();
    }

    public static boolean getIthBit(int no,int i){
        // approch 1
        //no = no >> i;
        //return ( no & 1 ) == 0 ? false : true ;

        // approch 2
        int bitMask = 1 << i;
        int res = no & bitMask;
        return res > 0 ? true : false;

    }
}
