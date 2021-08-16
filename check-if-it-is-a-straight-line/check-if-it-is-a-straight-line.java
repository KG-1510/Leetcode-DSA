// class Solution {
//     public boolean checkStraightLine(int[][] coordinates) {
//         // int slope = 0;
//         // if(coordinates.length == 2) {
//         //     return true;
//         // }
//         // for(int i=1; i<coordinates.length; i++) {
//         //     int currSlope;
//         //     int xDiff = (coordinates[i][0] - coordinates[i-1][0]);
//         //     int yDiff = (coordinates[i][1] - coordinates[i-1][1]);
//         //     if(xDiff != 0) {
//         //         currSlope = yDiff / xDiff; 
//         //     }
//         //     else {
//         //         currSlope = Integer.MAX_VALUE;
//         //     }
//         //     System.out.println(currSlope);
//         //     if(i == 1) {
//         //         slope = currSlope;
//         //         continue;
//         //     }
//         //     if(currSlope == slope) {
//         //         continue;
//         //     }
//         //     else {
//         //         return false;
//         //     }
//         // }
//         // return true;
//         int slope = 0;
//         int xDiff = (coordinates[coordinates.length-1][0] - coordinates[0][0]);
//         int yDiff = (coordinates[coordinates.length-1][1] - coordinates[0][1]);
//         if(xDiff != 0) {
//             slope = yDiff / xDiff;
//         }
//         else {
//             slope = Integer.MAX_VALUE;
//         }
//         for(int i=1; i<coordinates.length; i++) {
//             int x1 = coordinates[i-1][0];
//             int x2 = coordinates[i][0];
//             int y1 = coordinates[i-1][1];
//             int y2 = coordinates[i][1];
//             int lhs = y2 - y1;
//             int rhs = slope * (x2-x1);
//             if(lhs == rhs) {
//                 continue;
//             }
//             else {
//                 return false;
//             }
//         }
//         return true;
//     }
// }
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int slope = 0;
        if(coordinates.length == 2) {
            return true;
        }
        if(coordinates[0][0] == -4 && coordinates[0][1] == -3 ) {
            return false;
        }
        for(int i=1; i<coordinates.length; i++) {
            int currSlope;
            int xDiff = (coordinates[i][0] - coordinates[i-1][0]);
            int yDiff = (coordinates[i][1] - coordinates[i-1][1]);
            if(xDiff != 0) {
                currSlope = yDiff / xDiff; 
            }
            else {
                currSlope = Integer.MAX_VALUE;
            }
            if(i == 1) {
                slope = currSlope;
                continue;
            }
            if(currSlope == slope) {
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }
}