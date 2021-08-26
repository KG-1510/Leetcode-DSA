class Solution {
    public int maximumProduct(int[] nums) {
//         // selection sort
//         for(int i=0; i<nums.length; i++) {
//             int last = nums.length - i - 1;
//             int max = 0;
            
//             // find max
//             for(int j=0; j<=last; j++) {
//                 if(nums[j] > nums[max]) {
//                     max = j;
//                 }
//             }
            
//             // swap
//             int temp = nums[i];
//             nums[i] = nums[max];
//             nums[max] = temp;
//         }
//         return Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 1] * nums[nums.length - 2] *            nums[nums.length - 3]);
    }
}