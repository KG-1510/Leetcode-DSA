class Solution {
    public int findDuplicate(int[] nums) {
        // cyclic sort
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else {
                i++;
            }
        }
        
        for(int j=0; j<nums.length; j++) {
            if(nums[j] - 1 != j) {
                return nums[j];
            }
        }
        return -1;
    }
}