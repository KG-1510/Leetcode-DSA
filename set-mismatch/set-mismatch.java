class Solution {
    public int[] findErrorNums(int[] nums) {
        // cyclic sort
        int[] arr = new int[2];
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
                arr[0] = nums[j];
                arr[1] = j + 1;
            }
        }
        return arr;
    }
}