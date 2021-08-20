class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = 0;
        for(int i: nums) {
            if(hm.containsKey(i)) {
                int temp = hm.get(i);
                temp++;
                hm.put(i, temp);
            }
            else {
                hm.put(i, 1);
            }
        }
        for(int i : hm.keySet()) {
            if(hm.get(i) == 1) {
                ans = i;
            }
        }
        return ans;
    }
}