class Solution {
    public void moveZeroes(int[] nums) {
        int p = 0;
    for(int i=0;i<nums.length;i++){
        if(nums[i] != 0){
            int temp = nums[p];
            nums[p] = nums[i];
            nums[i] = temp;
            p++;
        }
    }
    }
}