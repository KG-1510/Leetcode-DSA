class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        int[] ans = new int[nums.length];
        for(int i: nums) {
            if(i%2 == 0) {
                even.add(i);
            }
            else {
                odd.add(i);
            }
        }
        int count = 0;
        for(int j=0; j<even.size(); j++) {
            ans[count] = even.get(j);
            count++;
        }
        for(int k=0; k<odd.size(); k++) {
            ans[count] = odd.get(k);
            count++;
        }
        return ans;
    }
}