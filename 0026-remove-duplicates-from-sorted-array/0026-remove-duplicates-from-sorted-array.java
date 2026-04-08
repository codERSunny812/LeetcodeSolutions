class Solution {
    public int removeDuplicates(int[] nums) {
        int low = 0;
        int high = low + 1;
        int length = nums.length;

        while(high < length){
            if(nums[high] == nums[high - 1]){
                high++;
                continue;
            }else{
              nums[low+1] = nums[high];
              high++;
              low++;
            }
        }

        return low+1;
        
    }
}