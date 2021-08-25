class Solution {
    public boolean containsDuplicate(int[] nums) {
      // INFO: bubble sort the array, check if the array is strictly increasing
        boolean swapped;
        for(int i=0; i<nums.length; i++) {
            swapped = false;
            for(int j=1; j<nums.length-i; j++) {
                if(nums[j] < nums[j-1]) {
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }

        // INFO: check if it is strictly increasing
        for(int k=1; k<nums.length; k++) {
            System.out.println(nums[k-1] + " " + nums[k]);
            if(nums[k] > nums[k-1]) {
                continue;
            }
            else {
                return true;
            }
        }
        return false;
    }
}