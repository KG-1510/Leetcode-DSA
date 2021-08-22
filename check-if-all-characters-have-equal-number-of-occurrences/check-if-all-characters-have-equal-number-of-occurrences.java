class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        
        int occ = -1;
        for(char c: hm.keySet()) {
            if(occ == -1) {
                occ = hm.get(c);
            }
            else {
                if(occ == hm.get(c)) {
                    continue;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
}