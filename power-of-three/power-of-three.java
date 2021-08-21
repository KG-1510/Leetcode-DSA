class Solution {
    public boolean isPowerOfThree(int n) {
        if(n == 1) return true;
        int start = 1;
        int end = n;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(Math.pow(3, mid) > n) {
                end = mid - 1;
            }
            else if(Math.pow(3, mid) < n) {
                start = mid + 1;
            }
            else {
                return true;
            }
        }
        return false;
    }
}