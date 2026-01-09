public class CountSetBits {
    public static void main(String[] args) {
        int no = 7;
        int res = countSetBits(no);
        System.out.println("The number "+no+" has "+res+" set bits");
    }

    public static int countSetBits(int no){
        if(no == 0)
            return 0;
        return (no & 1) + countSetBits(no >> 1);

    }
}
