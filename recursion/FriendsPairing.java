// package recursion;

import java.util.Scanner;
public class FriendsPairing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Total Friends: ");
        int no = sc.nextInt();
        int ways = findWayes(no);
        System.out.println("Total ways to pair "+no+" freinds are: "+ways);
    }

    public static int findWayes(int no){
        if(no == 1 || no == 2)
            return no;
        return findWayes(no-1) + (no-1) * findWayes(no-2);
    }
}
