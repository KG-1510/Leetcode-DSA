class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] ans =  new int[encoded.length+1];
        for(int i=0; i<ans.length; i++) {
            if(i == 0) {
                ans[0] = first;
                ans[1] = (first ^ encoded[0]); 
                continue;
            }
            if(i == 1) {
                continue;
            }
            ans[i] = (ans[i-1] ^ encoded[i-1]);
        }
        return ans;
    }
}