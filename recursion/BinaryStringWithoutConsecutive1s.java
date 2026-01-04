import java.util.Scanner;
public class BinaryStringWithoutConsecutive1s{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of the binary string: ");
        int n = sc.nextInt();
        String res = "";
        printBinaryString(n,0,res);
    }

    public static void printBinaryString(int n ,int lastPlaced, String res){
        if(n == 0){
            System.out.println(res);
            return;
        }
        if(lastPlaced != 1){
            printBinaryString(n-1,0, res + 0);
            printBinaryString(n-1,1, res+1);
        }
        else{
            printBinaryString(n-1, 0, res+0);
        }
        
    }
}