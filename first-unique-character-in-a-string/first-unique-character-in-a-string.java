class Solution {
    public int firstUniqChar(String s) {
       //  int ans = -1;
       // for(int i=0; i<s.length(); i++) {
       //     int flag = 0;
       //     for(int j=0; j<s.length(); j++) {
       //         if(s.charAt(j) != s.charAt(i)) {
       //             continue;
       //         }
       //         else if(i == j) {
       //             continue;
       //         }
       //         else {
       //             flag = 1;
       //             break;
       //         }
       //     }
       //     if(flag == 0) {
       //         ans = i;
       //         break;
       //     }
       // }
       //  return ans;
        // int ans = -1;
        // HashMap<Character, Integer> hm = new HashMap<>();
        // for(int i=0; i<s.length(); i++) {
        //     if(hm.containsKey(s.charAt(i))) {
        //         int temp = hm.get(s.charAt(i));
        //         temp++;
        //         hm.put(s.charAt(i), temp);
        //     }
        //     else {
        //         hm.put(s.charAt(i),1);
        //     }
        // }
        // int min = s.length()-1;
        // for(char i: hm.keySet()) {
        //     if(hm.get(i) == 1) {
        //         if(s.indexOf(i) <= min) {
        //             min = i;
        //         }
        //     }
        // }
        // if(min > -1) {
        //     return min;
        // }
        // return -1;
        
                HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        int n = s.length();
        // build hash map : character and how often it appears
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        
        // find the index
        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1) 
                return i;
        }
        return -1;
    }
}