class Solution {
    public void rotate(int[] nums, int k) {

        int len = nums.length;
        k = k % len;

        int[] temp = new int[k];

        // 1️⃣ Store last k elements
        for (int i = 0; i < k; i++) {
            temp[i] = nums[len - k + i];
        }

        // 2️⃣ Shift remaining elements to the right
        for (int i = len - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }

        // 3️⃣ Put temp elements at beginning
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
}