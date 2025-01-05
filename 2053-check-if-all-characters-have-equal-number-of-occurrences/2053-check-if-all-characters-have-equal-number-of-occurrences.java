import java.util.*;
class Solution {

   // Method to check if all values in the hashtable are equal
    public boolean check(Hashtable<Character, Integer> hashtable) {
        var values = hashtable.values(); // Get all the values from the hashtable

        Integer firstValue = null;
        for (Integer value : values) {
            // Ensure no null values
            if (value == null) {
                return false;
            }
            if (firstValue == null) {
                firstValue = value; // Set the reference value
            }
            // Check if the current value matches the reference
            if (!value.equals(firstValue)) {
                return false; // If any value differs, return false
            }
        }
        return true; // All values are equal
    }
    public boolean areOccurrencesEqual(String s) {
        // Hashtable to store the character and its occurrences
        Hashtable<Character, Integer> hash = new Hashtable<>();

        // Fill the hashtable with character counts
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            // Check if the character is already present in the table
            if (hash.containsKey(currentChar)) {
                // Increase the count
                hash.put(currentChar, hash.get(currentChar) + 1);
            } else {
                hash.put(currentChar, 1); // Initialize the count
            }
        }

        // Check if all values in the hashtable are equal
        return check(hash);
        
    }
}