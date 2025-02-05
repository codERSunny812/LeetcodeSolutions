class Solution {
    // Helper function for binary search
    int binarySearch(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;  // Base case: element not found
        }
        
        int mid = start + (end - start) / 2;  // Prevents integer overflow
        
        // Check if mid element is the target
        if (nums[mid] == target) {
            return mid; // Return the index of the found element
        }
        
        // If target is greater, search the right half
        if (target > nums[mid]) {
            return binarySearch(nums, target, mid + 1, end);
        }
        
        // If target is smaller, search the left half
        return binarySearch(nums, target, start, mid - 1);
    }

    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }
}
