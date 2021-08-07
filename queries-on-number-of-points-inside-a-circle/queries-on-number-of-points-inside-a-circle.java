class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] ans = new int[queries.length];
        for(int k=0; k<ans.length; k++) {
            ans[k] = 0;
        }
        for(int i=0; i<queries.length; i++) {
            int x1 = queries[i][0];
            int y1 = queries[i][1];
            double r = (double)(queries[i][2]);
            
            for(int j=0; j<points.length; j++) {
                int x2 = points[j][0];
                int y2 = points[j][1];
                double dist = (Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2)));

                if(dist <= r) {
                    ans[i]++;
                }
            }
        }
        return ans;
    }
}