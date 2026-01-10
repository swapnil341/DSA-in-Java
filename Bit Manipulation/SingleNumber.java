public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {10,10,20,20,5,3,3};
        int res = findSingleNumber(arr);
        for(int num : arr)
            System.out.println(num);
        System.out.println("Unique number is: "+res);
    }

    public static int findSingleNumber(int[] arr){
        int res = 0 ;
        for(int num : arr){
            res = res ^ num;
        }
        return res;
    }
}
