class Solution {
    public boolean isPalindrome(String s) {
        String copy = "";
        String palindrome = "";
        
        for(int i=s.length()-1; i>=0; i--) {
            if(s.charAt(i) != ' ') {
                if(Character.isLetterOrDigit(s.charAt(i))) {
                    palindrome += Character.toLowerCase((s.charAt(i)));
                }
            }  
        }
        
        for(int j=0; j<s.length(); j++) {
            if(s.charAt(j) != ' ') {
                if(Character.isLetterOrDigit(s.charAt(j))) {
                    copy += Character.toLowerCase((s.charAt(j)));
                }
            }  
        }
        
        System.out.println(copy);
        System.out.println(palindrome);        

        if(copy.equals(palindrome)) {
            return true;
        }
        return false;
    }
}