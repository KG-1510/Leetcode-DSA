/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int orderAgnosticBS(MountainArray arr, int target, int start, int end) {
        boolean isAsc = arr.get(start) < arr.get(end);

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } 
            else {
                if (target > arr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length()-1;
        while(start < end) {
            int mid = start + (end-start)/2;
            // INFO: decreasing part of array, so search on left for more potential answers
            if(mountainArr.get(mid) > mountainArr.get(mid+1)) {
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        
        int firstTry = orderAgnosticBS(mountainArr, target, 0, start);
        if(firstTry != -1) {
            return firstTry;
        }
        else {
            return orderAgnosticBS(mountainArr, target, start, mountainArr.length()-1);
        }
    }
}