class Solution {
    public int removeDuplicates(int[] nums) {
        int temp = 0;
        
        if (nums.length == 0) {
            return 0;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[temp] != nums[i]) {
                nums[++temp] = nums[i];
            }
        }
        return temp + 1;
    }
}