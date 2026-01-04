public class BinarySearch{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,14};
        System.out.println(binarySearch(arr, 0, arr.length, 14));

    }

    public static int binarySearch(int[] arr,int left,int right, int key){
        if(left > right)
            return -1;

        int mid = (left + right) / 2;

        if(arr[mid] == key)
            return mid+1;

        if(arr[mid] > key)
            return binarySearch(arr, left, mid, key);
        else
            return binarySearch(arr, mid, right, key);
    }
}