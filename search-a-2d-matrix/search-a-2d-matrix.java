class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowSearch = 0;
        int found = 0;
        if(matrix[0].length == 1 && matrix.length < 1) {
            return matrix[0][0] == target;
        }
        for(int i=0; i<matrix.length; i++) {
            int len = matrix[i].length - 1;
            if(target <= matrix[i][len]) {
                rowSearch = i;
                found = 1;
                break;
            }
        }
        if(found == 1) {
        for(int j=0; j<matrix[rowSearch].length; j++) {
            if(matrix[rowSearch][j] == target) {
                return true;
            }
        }
        }
        return false;
    }
}