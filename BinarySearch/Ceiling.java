package BinarySearch;

public class Ceiling {
    public static void main(String[] args) {
        int[] nums = { 12, 34, 7896 };
        System.out.println(ceiling(nums, 11));
    }
    static int ceiling(int[] arr, int target) {
        if (arr.length == 0) {
            return 1;

        }
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(target>arr[mid]){
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            }
        }
        return start;
    }
}
