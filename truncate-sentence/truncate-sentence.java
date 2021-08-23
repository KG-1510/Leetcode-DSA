class Solution {
    public String truncateSentence(String s, int k) {
        ArrayList<String> arr = new ArrayList<>();
        String word = "";
        for(int i=0; i<s.length(); i++) {
            if(!Character.isSpace(s.charAt(i))) {
                word += s.charAt(i);
            }
            else {
                arr.add(word);
                word = "";
            }
        }
        arr.add(word);
        String ans = "";
        int count = 1;
        for(int i=0; i<arr.size(); i++) {
            if(count <= k) {
                ans = ans + arr.get(i) + " ";
                count++;
            }
            else {
                break;
            }
        }
        ans = ans.substring(0, ans.length()-1);
        return ans;
    }
}