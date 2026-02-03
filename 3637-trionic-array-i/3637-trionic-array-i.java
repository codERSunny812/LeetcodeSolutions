class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (n < 4) return false;

        int i = 1;

      
        while (i < n && nums[i] > nums[i - 1]) i++;
        if (i == 1 || i == n) return false;
        int p = i - 1;

        
        while (i < n && nums[i] < nums[i - 1]) i++;
        if (i == p + 1 || i == n) return false;
        int q = i - 1;

        
        while (i < n && nums[i] > nums[i - 1]) i++;

        return i == n && p < q && q < n - 1;
    }
}
