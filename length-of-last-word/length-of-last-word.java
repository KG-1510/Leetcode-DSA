class Solution {
    public int lengthOfLastWord(String s) {
    //     String word = "";
    //     if(s.length() != 0) {
    //     for(int i=0; i<s.length(); i++) {
    //         if(s.trim().length() == 0) {
    //             return 0;
    //         }
    //         if(s.charAt(i) != ' ') {
    //             word += s.charAt(i);
    //         }
    //         if(i == s.length()-1 && s.charAt(i) != ' ') {
    //             return word.length();
    //         }
    //         if (s.charAt(i) == ' ' && i != s.length()-1) {
    //          word = "";   
    //         }
    //         if(s.charAt(i) == ' ' && i == s.length()-1) {
    //             return 1;
    //         }
    //     }
    // }
    //     return 0;
        String[] words = s.split(" ");
        if(words.length == 0) return 0;
        return words[words.length - 1].length();
    }
}