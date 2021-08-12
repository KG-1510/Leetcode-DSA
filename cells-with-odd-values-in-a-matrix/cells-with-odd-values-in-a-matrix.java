class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] arr= new int[m][n];
        for(int j=0;j<n;j++){
            for(int i=0;i<indices.length;i++)
                arr[indices[i][0]][j]+=1; 
                
        }
        for(int j=0;j<m;j++){
           for(int i=0;i<indices.length;i++)
                arr[j][indices[i][1]]+=1; 
        }
        int count=0;
        for(int[] i : arr){
            for(int j=0;j<n;j++){
                if(i[j]%2!=0)
                    count++;
            }
        }
        return count;
        
    }
}