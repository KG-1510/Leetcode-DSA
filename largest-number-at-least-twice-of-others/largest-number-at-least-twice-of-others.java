class Solution {
    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int index = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        
        for(int j=0; j<nums.length; j++) {
            if(j == index) continue;
            if(nums[j]*2 <= max) {
                continue;
            }
            else {
                return -1;
            }
        }
        return index;
    }
}