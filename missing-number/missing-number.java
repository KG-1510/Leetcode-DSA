class Solution {
    public int missingNumber(int[] nums) {
        if(nums.length == 1) {
            if(nums[0] != 1) {
                int ans = nums[0] + 1;
                return ans;
            }
            return 0;
            
        }
        // INFO: bubble sort
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
        
        System.out.println(Arrays.toString(nums));
        int ans = nums[nums.length-1] + 1;
        for(int k=1; k<nums.length; k++) {
            if(nums[k] - nums[k-1] != 1) {
                ans = nums[k-1] + 1; 
                break;
            }
            if(nums[0] != 0) {
                return 0;
            }
        }
        return ans;
    }
}