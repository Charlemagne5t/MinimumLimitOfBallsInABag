import java.util.*;

public class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        int left = 1;
        int right = max;
        int mid = 0;
        int result = max;
        while (left <= right) {
            mid = left + (right - left) / 2;
            int count = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % mid == 0) {
                    count += nums[i] / mid - 1;
                } else count += nums[i] / mid;

            }

            if (count > maxOperations) {
                left = mid + 1;
            } else {
                result = Math.min(result, mid);
                right = mid - 1;
            }

        }
        return result;
    }
}