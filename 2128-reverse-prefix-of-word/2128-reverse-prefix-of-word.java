class Solution {
    int findIndex(String str , char ch){
        int index=-1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ch){
                index=i;
                return index;
            }
        }
        return index;
    }

    String reverseTheString(String str , int index){
        int start=0;
        int occurIndex = index;
        StringBuilder sb = new StringBuilder();
        
        // loop to reverse the string
        for(int i=occurIndex;i>=start;i--){
            sb.append(str.charAt(i));
        }

        // adding the rest of the string
        for(int i=occurIndex+1;i<str.length();i++){
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }
    public String reversePrefix(String word, char ch) {
        
        // find the index of the first occurance of the Ch in the string
        int index = findIndex(word,ch);
        // ch is not  found in the word
        if(index == -1) return word;

        String reverseString = reverseTheString(word,index);

        return reverseString;


    }
}