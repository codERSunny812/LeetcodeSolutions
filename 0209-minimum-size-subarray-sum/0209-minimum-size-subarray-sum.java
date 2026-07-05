class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low_point = 0, high_point = 0, sum = 0 , res = Integer.MAX_VALUE;

        for(int i = high_point;i<nums.length;i++){
            sum += nums[high_point];

            //check for the condition
            while(sum >= target){
            int len = high_point - low_point +1;
            res = Math.min(len , res);
            low_point++;
            sum = sum - nums[low_point -1];
            }

            high_point++;


        }

        return res == Integer.MAX_VALUE ? 0 : res;
    }
}