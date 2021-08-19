class Solution {
    public boolean rotateString(String s, String goal) {
        int len = s.length();
        int i = 0;
        while(i < len) {
            String ch = s.charAt(0) + "";
            s = s + ch;
            s = s.substring(1);
            System.out.println(s);
            if(s.equals(goal)) {
                return true;
            }
            i++;
        }
        return false;
    }
}