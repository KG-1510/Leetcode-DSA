class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = {0,0};
        for(int i=0; i<numbers.length; i++) {
            int sum = 0;
            sum += numbers[i];
            for(int j=i+1; j<numbers.length; j++) {
                sum += numbers[j];
                if(sum == target) {
                    ans[0] = i+1;
                    ans[1] = j+1;
                    break;
                }
                sum -= numbers[j];
            }
        }
        return ans;
    }
}