class Solution {
    public int[] searchRange(int[] nums, int target) {
    
    int left = search(nums,target,true);
     int right = search(nums,target,false);

     int[] ans  = new int[2];
     ans[0] = left;
     ans[1] = right;

     return ans;


        
    }
    static int search(int[] nums, int target, boolean var){
        int l = 0;
        int r = nums.length-1;
        int i=-1;
        while(l<=r){
          int mid = (l+r)/2;
          if(nums[mid]<target){
            l = mid+1;
          }
          else if(nums[mid]>target){
            r = mid-1;
          }
          else{
            i = mid;
             if(var){
                r = mid-1;
             }
             else{
                l = mid+1;
             }
          }
          
         }

         return i;
    
    }
} 