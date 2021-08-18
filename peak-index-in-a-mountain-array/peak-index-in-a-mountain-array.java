class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                ans = i;
            }
        }
        return ans;
    }
}