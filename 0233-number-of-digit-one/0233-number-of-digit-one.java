

class Solution {
    public int countDigitOne(int n) {
        int count = 0;       // Initialize the count of '1's
        long factor = 1;     // Start with the units place

        while (factor <= n) {
            long higher = n / (factor * 10);
            long current = (n / factor) % 10;
            long lower = n % factor;

            if (current > 1) {
                // If the current digit is greater than '1', add (higher + 1) * factor
                count += (higher + 1) * factor;
            } else if (current == 1) {
                // If the current digit is '1', add higher * factor + lower + 1
                count += higher * factor + lower + 1;
            } else {
                // If the current digit is less than '1', add higher * factor
                count += higher * factor;
            }

            factor *= 10; // Move to the next higher digit position
        }

        return count;
    }
}
