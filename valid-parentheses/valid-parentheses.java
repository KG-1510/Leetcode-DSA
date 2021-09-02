class Solution {
    public boolean isValid(String s) {
         if(s.length()%2 != 0)
            return false;

        return verify(s, 0, new Stack<Character>());
    }
    
    public boolean verify(String s, int index, Stack<Character> stack) {
        
        if (s.length() <= index)
            return stack.empty();
          
        char c = s.charAt(index);
        
        if (!stack.empty() 
            && ((stack.peek() == '(' && c == ')')
            || (stack.peek() == '{' && c == '}')
            || (stack.peek() == '[' && c == ']'))){ 
            stack.pop();
            return verify(s, ++index, stack);
        } else {
            stack.push(c);
            return verify(s, ++index, stack);
        }
    }
}