class Solution {
    public int signFunc(int n) {
        if(n == 0) {
            return 0;
        }
        else if(n > 0) {
            return 1;
        }
        else {
            return -1;
        }
    }
    public int arraySign(int[] nums) {
        int product = 1;
        for(int i=0; i<nums.length; i++) {
            product *= signFunc(nums[i]);
        }
        return product;
    }
}