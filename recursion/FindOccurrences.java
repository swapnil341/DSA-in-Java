public class FindOccurrences {
    public static void main(String[] args){
        int[] arr = {1,2,1,2,3,4,5,3,4,5,2};
        findOccurrences(arr, 2, 0);
    }   

    public static void findOccurrences(int[] arr, int key, int index){
        if(index >= arr.length )
            return ;  
        if(arr[index] == key){
            System.out.print(index + " ");
        }
        findOccurrences(arr, key, index+1);
    }
}
