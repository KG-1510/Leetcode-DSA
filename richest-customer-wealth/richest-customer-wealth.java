class Solution {
    public int maximumWealth(int[][] accounts) {
        // System.out.println(accounts.length);
        int ans[] = new int[accounts.length];
        for(int i=0; i<accounts.length; i++) {
            int sum = 0;
            for(int j=0;j<accounts[0].length; j++) {
                sum += accounts[i][j];
            }
            ans[i] = sum;
        }
        Arrays.sort(ans);
        return ans[ans.length-1];
        // return 0;
    }
}