class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i=0; i<nums.length; i++) {
            int searchElement = nums[i];
            int found = 0;
            for(int j=0; j<nums.length; j++) {
                if(nums[j] == searchElement) {
                    found++;
                }
            }
            if(found == 1) {
                ans = searchElement;
                break;
            }
        }
        return ans;
    }
}