import java.util.Scanner;
public class ConvertToUpperCase {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("String: ");
            String str = sc.nextLine();
            String res = toUpper(str);
            System.out.println(res);
        }
    }

    public static String toUpper(String str){
        String res = "";
        for(int i = 0 ; i < str.length(); i++){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                res = res + (char) ((str.charAt(i) - 'a') + 'A');
            }
            else{
                res = res + str.charAt(i);
            }
        }
        return res;
    }
    
}
