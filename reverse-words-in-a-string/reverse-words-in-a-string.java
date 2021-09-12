class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        System.out.println(Arrays.toString(words));
        String ans = "";
        for(int i=words.length-1; i>=0; i--) {
            if(words[i].isBlank()) {
                continue;
            }
            String temp = words[i].trim();
            ans = ans + temp + " ";
        }
        String finalAns = ans.trim();
        return finalAns;
    }
}