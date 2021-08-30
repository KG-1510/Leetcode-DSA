class Solution {
    public boolean halvesAreAlike(String s) {
        int count = 0;
        int length = s.length();
        
        for(int i=0;i<length/2;i++){
            if(checkIfVowel(s.charAt(i))){
                count++;
              }
            
            if(checkIfVowel(s.charAt(s.length()-1-i))){
                count--;
              }
            
        }
        return count == 0;
    }
    
    public boolean checkIfVowel(char elem){
        if(elem == 'a' || elem == 'e' || elem == 'i' || elem == 'o' || elem == 'u' || elem == 'A' || elem == 'E' || elem == 'I' || elem == 'O' || elem == 'U'){
            return true;
        }
        return false;
    }
}