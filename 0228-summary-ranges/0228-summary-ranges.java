class Solution {
    public List<String> summaryRanges(int[] nums) {
      
      List<String> str = new ArrayList<>();
      // 0,1,2,4,5,7
      
          
      if(nums.length == 0 || nums == null){
        return str;
      }
      
      int a = nums[0];
      int b = 0 ;
  
    //   if(nums.length == 1){
    //     str.add(String.valueOf(nums[0]));
    //     return str;
    //   }
      
       for(int i=0;i<nums.length;i++){
        int curr = nums[i]; // a =0
        if(i + 1 == nums.length || nums[i+1] != nums[i] + 1){
             b = nums[i];
             if(a!=b){
                str.add(a+"->"+b);
             }
             else{
                str.add(String.valueOf(a));
             }
            if (i + 1 < nums.length) {
                    a = nums[i+1];
                }
        
          }
       } 
       return str;
    }
}


// i = 0 ; 
// a = 30



// 0,1,2,4,5,7
// a=0
// b = 2
// 0 -> 2
// a = 4
// b = 5
// 4 -> 5

// 2,3,4,5,
// i+1->3
// 345
// i+1 =! 6  nums[i] =b
// 0,1,2,4,5,7
// for(i to length){
//     a = nums[i]
//     b = nums[i]+a;
//      if(a != b){
//         add to string
//      }else{
//         only add a
//      }
// }