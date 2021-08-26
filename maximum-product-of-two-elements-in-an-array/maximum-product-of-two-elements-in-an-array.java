class Solution {
    public int maxProduct(int[] nums) {
        // // bubble sort
        // boolean swapped;
        // for(int i=0; i<nums.length; i++) {
        //     swapped = false;
        //     for(int j=1; j<nums.length-i; j++) {
        //         if(nums[j] < nums[j-1]) {
        //             int temp = nums[j];
        //             nums[j] = nums[j-1];
        //             nums[j-1] = temp;
        //             swapped = true;
        //         }
        //     }
        //     if(!swapped) {
        //         break;
        //     }
        // }
        Arrays.sort(nums);
        int ans = (nums[nums.length-1]-1) * (nums[nums.length-2]-1);
        return ans;
    }
}