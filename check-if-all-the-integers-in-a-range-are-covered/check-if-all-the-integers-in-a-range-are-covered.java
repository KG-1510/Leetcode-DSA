class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
//         int lflag = 0;
//         int rflag = 0;
//         int count = 0;
//         for(int i=0; i<ranges.length; i++) {  
//             for(int j=left; j<=right; j++) {
//                 if(left >= ranges[i][0] && right <= ranges[i][1]) {
//                     return true;
//                 }
//                 if(j >= ranges[i][0] && j <= ranges[i][1]) {
//                     count++;
//                 }
//                 if(left == ranges[i][0] || left == ranges[i][1]) {
//                     lflag = 1;
//                 }
//                 if(right == ranges[i][1] || left == ranges[i][0]) {
//                     rflag = 1;
//                 }
//             }
//         }
        
//         System.out.println(count + " " + (right-left)+1);
//         System.out.println(lflag + " " + rflag);
//         if(count >= (right-left)+1 && (lflag == 1 || rflag == 1)) {
//             return true;
//         }
//         else if(count >= (right-left)+1 && (lflag != 0 || rflag != 0)) {
//             return true;
//         }
//         return false;
        boolean[] vis = new boolean[51];
        for(int i=0;i<ranges.length;i++){
            for(int j=ranges[i][0];j<=ranges[i][1];j++)
                vis[j]= true;
        }
        for(int i=left;i<=right;i++){
            if(!vis[i]) return false;
        }
        return true;
    }
}