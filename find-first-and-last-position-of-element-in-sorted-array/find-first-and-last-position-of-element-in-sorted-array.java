class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 1) {
            int[] ans = {-1,-1};
            if(nums[0] == target) {
                ans[0] = 0;
                ans[1] = 0;
            }
            return ans;
        }
        int[] ans = {-1, -1};
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == target && ans[0] == -1) {
                ans[0] = i;
                count++;
            }
            else if(nums[i] == target) {
                ans[1] = i;
                count++;
            }
        }
        if(count == 1) {
            ans[1] = ans[0];
        }
        return ans;
    }
}