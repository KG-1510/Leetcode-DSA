class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        if(mat[0].length == 1) {
            return mat[0][0];
        }
        for(int i=0; i<mat.length; i++) {
            // INFO: Sum of primary diagonal
            for(int j=0; j<mat[i].length; j++) {
                if(i == j) {
                    sum += mat[i][j];
                }
            }
        }
        // INFO: Sum of secondary diagonal
            int row = 0;
            int col = mat[0].length-1;
            while(row < mat[0].length) {
                sum += mat[row][col];
                row++;
                col--;
            }
        System.out.println(sum);
        if(mat[0].length%2 != 0) {
            int mid = ((mat[0].length-1) / 2);
            System.out.println(mat[mid][mid]);
            sum = sum - mat[mid][mid];
        }
        return sum;
    }
}
// 7 9 8 6 3
// 3 9 4 5 2
// 8 1 10 4 10
// 9 5 10 9 6
// 7 2 4 10 8