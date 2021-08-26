class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int k=0; k<nums.length; k++) {
            nums[k] = nums[k]*nums[k];
        }
        System.out.println(Arrays.toString(nums));
        // selection sort
        for(int i=0; i<nums.length; i++) {
            int last = nums.length - i - 1;
            int max = 0;
            for(int j=0; j<=last; j++) {
                if(nums[j] > nums[max]) {
                    max = j;
                }
            }
            
            int temp = nums[max];
            nums[max] = nums[last];
            nums[last] = temp;
        }
        return nums;
    }
}