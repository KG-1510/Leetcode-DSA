class Solution {
    public String interpret(String command) {
        String ans = "";
        for(int i=0; i<command.length(); i++) {
            if(command.charAt(i) == 'G') {
                ans += "G";
                continue;
            }
            else if(command.charAt(i) == '(' && command.charAt(i+1) == ')') {
                ans += "o";
                i += 1;
                continue;
            }
            else {
                ans+= "al";
                i += 3;
                continue;
            }
        }
        return ans;
    }
}