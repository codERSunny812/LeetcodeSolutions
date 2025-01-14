class Solution {
    public String reverseWords(String s) {
        // Split the string by spaces into an array
        String[] arr = s.split(" ");

        // Create a StringBuilder to store the reversed words
        StringBuilder reversed = new StringBuilder();

        // Iterate over the words in reverse order and append them to the StringBuilder
        for (int i = arr.length - 1; i >= 0; i--) {
            String word = arr[i].trim(); //remove the extra spaces 
            if (!word.isEmpty()) {
               if (reversed.length() > 0) {
                    reversed.append(" "); // Add a space between words
                }
              
                reversed.append(word); // Append the word
                
            }
            
        }

        return reversed.toString(); // Convert the StringBuilder to a String and return
    }
}