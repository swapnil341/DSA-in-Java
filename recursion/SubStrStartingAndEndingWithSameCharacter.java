/*
Q - We are given a string S, we need to find the count of all 
contiguous substrings starting and ending with the same character.
*/

import java.util.HashMap;
import java.util.Scanner;

public class SubStrStartingAndEndingWithSameCharacter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String str = sc.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
        System.out.println("There are " +findSubString(str, 0, map)+" contiguous substrings start and end with the same character.");

    }

    public static int findSubString(String s, int index,HashMap<Character,Integer> map){
        if(index == s.length())
            return 0;

        if(!map.isEmpty() && map.containsKey(s.charAt(index))){
            map.put(s.charAt(index),map.get(s.charAt(index))+1);
            int val = map.get(s.charAt(index));
            return val + findSubString(s, index + 1, map);
        }
        else{
            map.put(s.charAt(index),1);
            return 1 + findSubString(s, index + 1, map);
        }
        
    }
}
