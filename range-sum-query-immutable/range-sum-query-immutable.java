class NumArray {

    int[] leftSum;

    public NumArray(int[] nums) {
        leftSum = new int[nums.length];
        
        int total = 0;
        for(int i = 0; i < nums.length; i++){
            total = total + nums[i];
            leftSum[i] = total;
        }
    }
    
    public int sumRange(int left, int right) {
        int prefixLeft = ((left - 1) >= 0) ? leftSum[left - 1] : 0;
        int prefixRight = leftSum[right];
        return prefixRight - prefixLeft;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */