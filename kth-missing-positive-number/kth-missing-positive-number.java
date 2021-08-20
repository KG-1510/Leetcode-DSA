class Solution {
    public int binarySearch(int[] arr, int start, int end, int target) {
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(arr[mid] > target) {
                end = mid - 1;
            }
            else if(arr[mid] < target) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=1; i<=10000; i++) {
            if(nums.size() > k) {
                break;
            } 
            int ans = binarySearch(arr, 0, arr.length-1, i);
            if(ans != -1) {
                continue;
            }
            else {
                nums.add(i);
            }
        }
        if(k < nums.size()) {
            return nums.get(k-1);
        }
        return -1;
    }
}
