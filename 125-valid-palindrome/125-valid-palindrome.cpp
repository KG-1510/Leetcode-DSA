class Solution {
public:
    bool isPalindrome(string s) {
                if(s==" ") return true;
        
        int i=0,j=s.length()-1;
        while(i<j)
        {
			// skipping all non alpha numeric characters from both the ends
            while(i<j && ( !((s[i]-'a')>=0 && (s[i]-'a')<=25) \
			&& !((s[i]-'A')>=0 && (s[i]-'A')<=25) ) && !(s[i]-'0'>=0 && s[i]-'0'<=9) )
                i++;
            while(i<j && ( !((s[j]-'a')>=0 && (s[j]-'a')<=25) \
			&& !((s[j]-'A')>=0 && (s[j]-'A')<=25) )&& !(s[j]-'0'>=0 && s[j]-'0'<=9)  )
                j--;
				// bitwise operation to convert any character to lowercase
            s[i]|=' ';
            s[j]|=' ';
            if(s[i]!=s[j]) return false;
            else
            {
                i++;
                j--;
            }
        }
		// After traversing the entire string
        return true;
    }
};