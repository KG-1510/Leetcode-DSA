class Solution {
    public String removeOccurrences(String s, String part) {
        int n = s.length();
        int m = part.length();
        while(s.contains(part))
        {
            int in = s.indexOf(part);
           s = s.substring(0, in) + s.substring(in + part.length());
        }
        return s;
    }
}