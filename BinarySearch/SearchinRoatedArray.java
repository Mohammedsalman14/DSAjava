package BinarySearch;

public class SearchinRoatedArray {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 6, 7, 9, 10, 1, 2 };
        System.out.println(search(arr,6));
    }

    static int search(int arr[], int target) {
        int pivot = peak(arr);
        if (pivot == -1) {
            // Array is not roated, check the array
            // just do simple binary search
            return binarysearch(arr, target, 0, arr.length - 1);
        }
        if (target >= arr[0]) {
            return binarysearch(arr, target, 0, pivot);
        }
        return binarysearch(arr, target, pivot + 1, arr.length - 1);
    }

    static int peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;

            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] > arr[mid]) {
                end = mid - 1;
            }
            if (arr[start] < arr[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int binarysearch(int[] arr, int target, int start, int end) {
        

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
