class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int count = 0;
        for(int i=0; i<nums.length; i+=2) {
            ans[i] = nums[count];
            count++;
        }
        
        int countagain = n;
        for(int j=1; j<nums.length; j+=2) {
            ans[j] = nums[countagain];
            countagain++;
        }

        return ans;
    }
}