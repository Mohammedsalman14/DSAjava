/**
 * test
 */
public class test {

    public static void main(String[] args) {
        int arr[] = { 12, 23, 34, 43, 54, 75 };
      
       
        System.out.println(ans(arr));

        // System.out.println(mainans2(arr, 34));
    }

    static int mainans(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberofdigits = digits(num);
        return numberofdigits % 2 == 0;
    }

    static int digits(int nums) {
        int count = 0;
        while (nums > 0) {
            count++;
            nums = nums / 10;
        }
        return count;

    }

    static int mainans2(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int newstart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newstart;
        }
        return binarysearch(arr, target, start, end);
    }

    static int binarysearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int infiniteArray(int arr[], int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
        }
        return -1;

    }
    static int ans(int arr[],int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int newstart=end-1;
            end=end+(end-start+1)*2;
            start=newstart;
        }
        return infiniteArray(arr, target, start, end);
    }
    static boolean even2(int num){
        int digits=noofdigits(num);
        return digits%2==0;

    }
    static int noofdigits(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
    static int ans(int[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(even2(arr[i])){
                count++;

            }
        }
        return count;
    }
}