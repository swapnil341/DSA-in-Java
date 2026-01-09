import java.util.Scanner;
public class IsPowerOf2 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Number: ");
            int no = sc.nextInt();
            boolean res = isPowerOf2(no);
            if(res){
                System.out.println(no + " is power of 2");
            }
            else
                System.out.println(no + " is not power of 2");

        }
    }

    public static boolean isPowerOf2(int no){
        return (no & (no - 1)) == 0 ? true : false;
    }

}
