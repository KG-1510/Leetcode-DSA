class Solution {
    public String sortSentence(String s) {
        String words[] = s.split(" ");
        String[] ans = new String[words.length];
        String str = "";
        for(int i=0; i<words.length; i++) {
            String word = words[i];
            String copy = word;
            copy = copy.substring(0, copy.length()-1);
            int num = Integer.parseInt(word.charAt(word.length()-1) + "");
            ans[num-1] = copy;
        } 
        for(int i=0; i<ans.length; i++) {
            if(i != ans.length-1) {
                str = str + ans[i] + " ";
            }
            else {
                str = str + ans[i];
            }
        }

        return str;
    }
}