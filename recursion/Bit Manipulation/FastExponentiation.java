public class FastExponentiation {
    public static void main(String[] args) {
        int base = 3;
        int pow = 3;
        double res = fastExpo(base,pow);
        System.out.println(res);
    }

    public static double fastExpo(int base, int pow){
        int ans = 1;
        while(pow != 0){
            if((pow & 1) == 1)
                ans *= base;
            base = base * base;
            pow = pow >> 1;
        }
        return ans;
    }
}
