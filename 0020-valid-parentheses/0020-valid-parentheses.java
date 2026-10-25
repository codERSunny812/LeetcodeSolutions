class Solution {
    public boolean isValid(String s) {
        Stack<Character> str = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // If it's an opening bracket, push it
            if (c == '(' || c == '{' || c == '[') {
                str.push(c);
            } else {
                // If it's a closing bracket, check if stack is empty first
                if (str.isEmpty()) {
                    return false;
                }
                
                // Match the parentheses using single quotes and .peek()/.pop()
                if ((c == ')' && str.peek() == '(') || 
                    (c == ']' && str.peek() == '[') || 
                    (c == '}' && str.peek() == '{')) {
                    str.pop(); 
                } else {
                    return false; 
                }
            }
        }
        
        // If stack is empty, all brackets matched successfully
        return str.isEmpty();
    }
}