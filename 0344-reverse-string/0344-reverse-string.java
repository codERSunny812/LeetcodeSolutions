class Solution {
    public void reverseString(char[] s) {
        Stack<Character> st = new Stack<>();
        
        // Push all characters into the stack
        for (int i = 0; i < s.length; i++) {
            st.push(s[i]);
        }
        
        // Pop elements back into the array in reverse order
        int i = 0;
        while (!st.isEmpty()) {
            s[i++] = st.pop();
        }
    }
}