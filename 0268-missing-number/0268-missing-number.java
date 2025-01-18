class Solution {
    public int missingNumber(int[] nums) {
       int length = nums.length;
       int sum = (int) length*(length+1)/2;
        
        int arrSum = 0;
       for(int i=0;i<length;i++){
        arrSum+= nums[i];
       }

       return sum - arrSum;
    }
}