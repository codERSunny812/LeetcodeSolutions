class Solution {
    public boolean isPalindrome(String s) {
        
        boolean isPalin = true;
        String str = s.trim().toLowerCase();

        int i=0;
        int j=str.length() -1;

        while(i<j){

            if(!Character.isLetterOrDigit(str.charAt(i))){
              i++;
              continue;
            }

            if(!Character.isLetterOrDigit(str.charAt(j))){
                j--;
                continue;
            }

            if(str.charAt(i) != str.charAt(j)){
                isPalin = false;
            }
            i++;
            j--;
        }

        return isPalin;
        
        


    }
}