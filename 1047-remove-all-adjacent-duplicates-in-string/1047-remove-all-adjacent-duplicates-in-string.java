class Solution {
    public String removeDuplicates(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            // Check if stack is not empty AND top matches current character
            if (!st.isEmpty() && st.peek() == s.charAt(i)) {
                st.pop(); 
            } else {
                st.push(s.charAt(i)); 
            }
        }
        
        String res = "";
        while (!st.isEmpty()) {
            res += st.pop(); // Use pop() so loop terminates
        }
        
        return new StringBuilder(res).reverse().toString();
    }
}