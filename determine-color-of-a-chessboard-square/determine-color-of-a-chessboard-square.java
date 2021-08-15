class Solution {
    public boolean squareIsWhite(String coordinates) {
        int letter = coordinates.charAt(0);
        int num = coordinates.charAt(1);
        int sum = 0;
        if(letter == 97){
            sum = 1 + num;
        }
        else if(letter == 98) {
            sum = 2 + num;
        }
        else if(letter == 99) {
            sum = 3 + num;
        }
        else if(letter == 100) {
            sum = 4 + num;
        }
        else if(letter == 101) {
            sum = 5 + num;
        }
        else if(letter == 102) {
            sum = 6 + num;
        }
        else if(letter == 103) {
            sum = 7 + num;
        }
        else if(letter == 104) {
            sum = 8 + num;
        }
        if(sum%2 == 0) {
            return false;
        }
        else {
            return true;
        }
    }
}