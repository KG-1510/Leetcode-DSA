class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start < end) {
            int mid = start + (end-start)/2;
            // descending part of array, check on left side
            if(nums[mid] > nums[mid+1]) {
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }
}