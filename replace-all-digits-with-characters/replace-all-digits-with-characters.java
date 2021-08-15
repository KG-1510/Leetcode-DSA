class Solution {
    public String replaceDigits(String s) {
        String ans = "";
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(!(Character.isDigit(ch))) {
                ans += ch;
            }
            else {
                char shifted = shift(s.charAt(i-1), Integer.parseInt(ch+""));
                ans += shifted;
            }
        }
        return ans;
    }
    public char shift(int x, int y) {
            char shiftedChar = (char)(x + y);
            return shiftedChar;
    }
}