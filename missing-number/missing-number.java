class Solution {
    public int missingNumber(int[] nums) {
        int i = 0; // iterator variable
        while(i < nums.length) { // loop from start to end
            int correct = nums[i];
            // check if nums[i] is below length and not equal to index
            if(nums[i] < nums.length && nums[i] != nums[correct]) { 
                int temp = nums[i]; // swap
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else {
                i++;
            }
        }
        
        for(int j=0; j<nums.length; j++) {
            if(nums[j] != j) {
                return j;
            }
        }
        return nums.length;
    }
}