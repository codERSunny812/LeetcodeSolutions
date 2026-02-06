class Solution {
    public void rotate(int[] nums, int k) {
        
       
        
     
        
        int ans[] = new int[nums.length];
        for(int i = 0 ; i < nums.length ;i++){

           ans[(i+k)%nums.length ] = nums[i];
            
        }
        for(int i = 0 ; i < nums.length; i++){
            nums[i] = ans[i];
        }
        
        // int  pos = nums.length - k; //7- 3 = 4
    
        // int []arr = new int[nums.length];
        
            
        // for(int j=pos;j<nums.length;j++){
        //     arr[j] = nums[j];
        // }
        
        // for(int i=0;i<pos;i++){
        //     arr[i] = nums[i];
        // }
        
        
        
        
        
        
    }
}





















   
// class Solution {
//     private static void reverse(int [] arr , int start , int end){
//         while(start < end  ){
//             int temp = arr[start];
//             arr[start]= arr[end];
//             arr[end] = temp;
//              start++;
//              end--;
//         }
//     }
//     public void rotate(int[] nums, int k) {
//     int n = nums.length; //7
//     k = k % n; //3
//     reverse(nums, 0 , n-1); 
//     reverse(nums,0,k-1);
//     reverse(nums,k,n-1);
//     }
// }