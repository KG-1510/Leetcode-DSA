class Solution {
    public int majorityElement(int[] nums) {
        HashSet<Integer> uniqueNums = new HashSet<Integer>();
        for(int i: nums) {
            uniqueNums.add(i);
        }
        for(int j: uniqueNums) {
            int count = 0;
            for(int k: nums) {
                if(j == k) {
                    count++;
                }
            }
            if(count > ((nums.length)/2)) {
                return j;
            }
        }
        return 0;
    }
}