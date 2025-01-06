class Solution {
    String rotateTheString(String str ){
        char ch = str.charAt(0);

        return str.substring(1,str.length())+ch;
    }
    public boolean rotateString(String s, String goal) {
        // boundary check 
        if(s==null || s.length()<=1 || s.length() != goal.length()) return false;

        int length = s.length();
        String str = s;
        while(length != 0){
            str = rotateTheString(str);

            if(str.equals(goal)){
                return true;
            }else{
                length --;
            }
        }
        return false;
    }
}