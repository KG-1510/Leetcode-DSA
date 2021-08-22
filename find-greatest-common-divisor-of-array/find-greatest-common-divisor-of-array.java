class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n1 = nums[0];
        int n2 = nums[nums.length-1];
        int gcd = 1;
        int ans;
        if(n2 > n1) {
            for(int i=1; i<=n2; i++) {
                if(n2%i == 0 && n1%i == 0) {
                    gcd = i;
                }
            }
            ans = gcd;
        }
        else {
            for(int i=1; i<=n1; i++) {
                if(n2%i == 0 && n1%i == 0) {
                    gcd = i;
                }
            }
            ans = gcd;
        }
        return ans;
    }
}