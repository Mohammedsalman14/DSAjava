package BinarySearch;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10,12,12};
        // int[]ans=SearchRange(nums, 7);
        // System.out.println(ans);
        System.out.println(Arrays.toString(SearchRange(nums, 12)));
        
    }

    static int[] SearchRange(int[] nums, int target) {
        int ans[] = { -1, -1 };
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
        while (start <=end) {

            int mid = start+(end-start)/2;

            if (nums[mid] > target) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
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
