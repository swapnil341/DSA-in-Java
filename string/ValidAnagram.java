import java.util.Scanner ;
public class ValidAnagram {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("First String(lowercase): ");
            String str1 = sc.nextLine();
            System.out.print("Second String(lowercase): ");
            String str2 = sc.nextLine();
            if(isAnagram(str1,str2)){
                System.out.println(str1+" and "+str2+" are Anagram");
            }
            else{              
                System.out.println(str1+" and "+str2+" are not Anagram");

            }
        }
    }

    public static boolean isAnagram(String str1,String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        int len = str1.length();
        int[] map = new int[26];

        for(int i = 0; i < len ; i++ ){
            map[str1.charAt(i) - 'a']++;
        }

        for(int i = 0 ; i < len ; i++){
            if(map[str2.charAt(i) - 'a'] == 0)
                return false;
            map[str2.charAt(i) - 'a']--;
        }

        return true;

    }
    
}
