class Solution {
    public char kthCharacter(int k) {
        String str = "a";
        while(str.length()<k){
            StringBuilder temp = new StringBuilder();
            for(char ch : str.toCharArray()){
                //checked the condition
                if(ch == 'z'){
                    temp.append('a');
                }else{
                    temp.append((char) (ch+1));
                }
            }
            str+=temp.toString();

        }

        return str.charAt(k-1);
    }
}