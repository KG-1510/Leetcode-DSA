class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] ans = new int[nums.length];
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]%2 == 0) {
                ans[count] = nums[i];
                count += 2;
            }
        }
        count = 1;
        for(int j=0; j<nums.length; j++) {
            if(nums[j]%2 != 0) {
                ans[count] = nums[j];
                count += 2;
            }
        }
        return ans;
    }
}