class Solution {
    public int firstUniqChar(String s) {
        int ans = -1;
       for(int i=0; i<s.length(); i++) {
           int flag = 0;
           for(int j=0; j<s.length(); j++) {
               if(s.charAt(j) != s.charAt(i)) {
                   continue;
               }
               else if(i == j) {
                   continue;
               }
               else {
                   flag = 1;
                   break;
               }
           }
           if(flag == 0) {
               ans = i;
               break;
           }
       }
        return ans;
    }
}