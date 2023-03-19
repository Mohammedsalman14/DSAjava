import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        // int[] nums = { 12, 34, 7896 };
        // System.out.println(findodd(nums));
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int[] ans = SearchRange(nums, 7);
        System.out.println(Arrays.toString(ans));

    }

    static int findodd(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (odd(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean odd(int num) {
        int numberofdigits = digits(num);
        return numberofdigits % 2 == 1;
    }

    static int digits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    static int[] SearchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    static int search(int[] nums, int target, boolean findstartindex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                if (findstartindex == true) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return ans;
    }

}
