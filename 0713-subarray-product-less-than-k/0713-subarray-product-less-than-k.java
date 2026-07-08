class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if( k <=1) return 0;
        int left = 0;
        int prod = 1;
        int cnt = 0;

        for(int i=0;i<nums.length;i++){

            prod *= nums[i];

            while(prod >= k){
                prod /= nums[left];
                left++;
            }


            if(prod < k){
            cnt += i - left +1;
                
            }
        }

        return cnt;
    }
}