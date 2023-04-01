package BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr={1,23,34,45,56,76,86};
        int target=45;
        System.out.println(mainans(arr, target));
    }

    static int mainans(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int newStart = end + 1;
            // double the box value
            // end = previous end +sizeofbox*2
            end = end + (end - start + 1) * 2;
            start = newStart;

        }
        return binarysearch(arr, target, start, end);
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
