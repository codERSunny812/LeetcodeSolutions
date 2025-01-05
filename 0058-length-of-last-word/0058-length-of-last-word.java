class Solution {
    public int lengthOfLastWord(String s) {
      s=s.trim(); // remove the white spaces from the word
      String [] arr = s.split(" "); //split the string into array on the basic of space
      String lastWord = arr[arr.length-1]; //get the last word of the array

      return lastWord.length();
      
    }
}