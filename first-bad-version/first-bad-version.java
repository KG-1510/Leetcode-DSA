/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int ans = 0;
        int start = 1;
        int end = n;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(isBadVersion(mid)) {
                ans = mid;
                end = mid - 1;
            }
            else if(!isBadVersion(mid)) {
                start = mid + 1;
            }
            else {
                ans = mid;
            }
        }
        return ans;
    }
}