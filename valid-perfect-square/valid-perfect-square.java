class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1) {
            return true;
        }
        int start = 1;
        int end = num;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if((long)mid*mid == num) {
               return true; 
            }
            else if((long)mid*mid > num) {
                end = mid - 1;
            }
            else if((long)mid*mid < num) {
                start = mid + 1;
            }

        }
        return false;
    }
}