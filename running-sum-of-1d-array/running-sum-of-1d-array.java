class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0; i<ans.length; i++) {
            int sum = nums[i];
            for(int j=0; j<i; j++) {
                sum += nums[j];
            }
            ans[i] = sum;
        }
        return ans;
    }
}