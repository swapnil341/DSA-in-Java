import java.util.Scanner;
public class CheckEvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int no = sc.nextInt();
        boolean res = checkEvenOdd(no);
        if(res)
            System.out.println(no + " is EVEN");
        else    
            System.out.println(no + " is ODD");

    }    

    public static boolean checkEvenOdd(int no){
        return (no & 1) != 0 ? false : true; 
    }
}
