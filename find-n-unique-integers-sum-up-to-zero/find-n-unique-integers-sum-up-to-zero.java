class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int sum = 0;
        if(n == 2) {
            ans[0] = 2;
            ans[1] = -2;
            return ans;
        }
        
        for(int i=0; i<n; i++) {
            if(i != n-1) {
                ans[i] = i;
                sum += i;
            }
            else {
                int num = -1 * sum;
                sum += num;
                ans[i] = num;
            }
        }
        return ans;
    }
}