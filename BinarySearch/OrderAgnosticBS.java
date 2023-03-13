package BinarySearch;

/**
 * OrderAgnosticBS
 */
public class OrderAgnosticBS {

    public static void main(String[] args) {
        int[] arr={99,89,75,22,11,10,5,2,-3};
        int target=22;
        System.out.println(binarysearch(arr, target));
    }

    static int binarysearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        boolean ASCD=arr[start]<arr[end];
        while (start <= end) {

            int mid = start + end / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if(ASCD){
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else{
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}