class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int maxSum = nums.at(0);
        int curSum = 0;
        if(nums.size() == 1) {
            return nums.at(0);
        }
        for(int n: nums) {
            curSum += n;
            if(curSum > maxSum) {
                maxSum = curSum;
            }
            if(curSum < 0) {
                curSum = 0;
            }
        }
        return maxSum;
    }
};