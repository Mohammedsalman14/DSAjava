package BinarySearch;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        int[] arr = { 12, 34, 45, 56, 76 };
        int target = 34;
        System.out.println(binarysearch(arr, target));
    }

    static int binarysearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {

            int mid = start + end / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }
}