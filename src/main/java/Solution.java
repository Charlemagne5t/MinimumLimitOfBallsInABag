class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int res = Integer.MAX_VALUE;
        int l = 1;
        int r = 1_000_000_000;
        int mid;

        while(l <=r){
            mid = l + (r - l) / 2;
            if(check(nums, maxOperations, mid)) {
                res = mid;
                r = mid - 1;
            }else l = mid + 1;
        }
        return res;
    }

    boolean check(int[] nums, int max, int target) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] <= target) {
                continue;
            }
            int ops = nums[i] % target == 0 ? nums[i] / target : nums[i] / target + 1;
            max -= ops -1;
            if(max < 0) {
                return false;
            }

        }
        return true;
    }
}