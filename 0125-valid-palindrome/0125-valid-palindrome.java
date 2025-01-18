class Solution {
    public boolean isPalindrome(String s) {
        //convert all the string into lower case 
        String str = s.toLowerCase();
        //create a string builder
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if((ch >='a' && ch <= 'z') || (ch >= '0' && ch <= '9')){
                sb.append(str.charAt(i));
            }
        }

       String reversed = sb.reverse().toString();

       return sb.reverse().toString().equals(reversed);
    }
}