package recursion;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string to remove duplicates: ");
		String str = sc.nextLine();
		boolean[] map = new boolean[26];
		StringBuilder result = new StringBuilder();
		System.out.println(removeDuplicates(str,map,0,result));
		
	}
	
	public static StringBuilder removeDuplicates(String str, boolean[] map, int index, StringBuilder result) {
		if(index == str.length())	
			return result;
		
		if(map[(int) str.charAt(index) - 'a'] == true)
			return removeDuplicates(str,map,index= index  + 1,result);
		else {
			map[(int) str.charAt(index) - 'a'] = true;
			result.append(str.charAt(index));
			return removeDuplicates(str,map,index = index + 1,result);
		}
	}

}
