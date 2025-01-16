class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        if(n%2==0 && m%2 == 0) return 0;

        int xorNums1 = 0, xorNums2 = 0;
        
        // XOR all elements of nums1
        for (int num : nums1) {
            xorNums1 ^= num;
        }
        
        // XOR all elements of nums2
        for (int num : nums2) {
            xorNums2 ^= num;
        }
        
        int result = 0;
        
        // If n (length of nums1) is odd, XOR the entire nums2 result
        if (n % 2 != 0) {
            result ^= xorNums2;
        }
        
        // If m (length of nums2) is odd, XOR the entire nums1 result
        if (m % 2 != 0) {
            result ^= xorNums1;
        }
        
        return result;
    }
}