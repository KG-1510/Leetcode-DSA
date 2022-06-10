class Solution {
public:
    bool isAnagram(string s, string t) {
        sort(s.begin(), s.end());
        sort(t.begin(), t.end());
        if(s.length() == t.length()) {
        for(int i=0; i<s.length(); i++) {
            if(s.at(i) == t.at(i)) {
                continue;
            }
            else {
                return false;
            }
        }
            return true;
        }
        else {
            return false;
        }
        
    }
};