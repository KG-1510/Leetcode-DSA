class Solution {
    public int mySqrt(int x) {
        int start = 1;
        int end = x/2;
        int res = 1;
        if(x == 0) {
            return 0;
        }
        while(start <= end) {
            int mid = start + (end-start) / 2;
            if((long)mid*mid <= x) {
                res = mid;
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return res;
    }
}