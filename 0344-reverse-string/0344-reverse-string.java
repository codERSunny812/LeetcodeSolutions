class Solution {
    public void reverseString(char[] s) {
        int first = 0;
        int last = s.length -1;
        while(first<last){
            char tmp = s[first];
            s[first] = s[last];
            s[last] = tmp;
            first++;
            last--;
        }
    }
}