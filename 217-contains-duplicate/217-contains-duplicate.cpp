class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        for(int i=1; i<nums.size(); i++) {
            int n1 = nums.at(i-1);            
            int n2 = nums.at(i);
            if(n1==n2) {
                return true;
            }
        }
        return false;
    }
};