class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> letters = new HashSet<>();
        int count = 0;
        for(int i=0; i<words.length; i++) {
            for(int j=0; j<words[i].length(); j++) {
                letters.add(words[i].charAt(j));
            }
            int flag = 0;
            System.out.println(letters + " " + letters.size());
            for(char k: letters) {
                if(allowed.contains(k+"")) {
                    continue;
                }
                else {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                count++;
            }
            letters.clear();
        }
        return count;
    }
}