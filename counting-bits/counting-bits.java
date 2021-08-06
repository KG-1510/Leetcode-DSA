class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=0; i <= n; i++) {
            String bin = Integer.toBinaryString(i);
            System.out.println(bin);
            int sum = 0;
            for(int j=0; j < bin.length(); j++) {
                sum += Integer.parseInt(bin.charAt(j)+"");
            }
            ans[i] = sum;
        }
        return ans;
    }
}