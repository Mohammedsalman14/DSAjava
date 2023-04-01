package BinarySearch;



/**
 * SearchInMoutain
 */
public class SearchInMoutain {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 2,1,4 };
        System.out.println(search(arr,1));
    }

    static int search(int[] arr, int target) {
        int peak = peakMoutain(arr);
        int firstTry = OrderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return OrderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }

    static int peakMoutain(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }

    static int OrderAgnosticBS(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        boolean ASCD = arr[start] < arr[end];
        while (start <= end) {

            int mid = start + end / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (ASCD) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
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