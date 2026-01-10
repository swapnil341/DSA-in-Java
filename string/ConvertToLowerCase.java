import java.util.Scanner;
public class ConvertToLowerCase {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("String: ");
            String str = sc.nextLine();
            String res = toLower(str);
            System.out.println("Before conversion: "+str);
            System.out.println("After conversion: "+res);
        }
    }

    public static String toLower(String str){
        String res = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                res = res + (char)((str.charAt(i) - 'A') + 'a');
            }
            else{
                res = res + str.charAt(i);
            }
        }
        return res;
    }
}