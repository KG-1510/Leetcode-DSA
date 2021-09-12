class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charsS = s.toCharArray();
        Arrays.sort(charsS);
        char[] charsT = t.toCharArray();
        Arrays.sort(charsT);
        
        if(charsT.length != charsS.length) {
            return false;
        }
        
        for(int i=0; i<charsT.length; i++) {
            if(charsT[i] == charsS[i]) {
                continue;
            }
            else {
                return false;
            }
        }
        return true;
        // String sorted = new String(chars);
        // System.out.println(sorted);
    }
}