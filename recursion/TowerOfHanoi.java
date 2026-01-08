public class TowerOfHanoi {
    public static void main(String[] args){
        TOHHelper(2,'S','D','A');
    }

    public static void TOHHelper(int n, char sourse, char destination, char auxilary ){
        if(n == 1){
            System.out.println("Moving disck "+n+" from " + sourse + " to " + destination);
            return ;
        }
        TOHHelper(n-1, sourse, auxilary, destination);
        System.out.println("Moving disck "+n+" from " + sourse + " to " + destination);
        TOHHelper(n-1, auxilary, destination, sourse);
    }
}
