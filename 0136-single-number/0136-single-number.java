class Solution {
    public int singleNumber(int[] nums) {
    //  HashMap<Integer,Integer> map  = new HashMap<>();
    //  for(int i = 0 ; i < nums.length ; i++){
    //     if(map.containsKey(nums[i])){
    //         map.put(nums[i],map.getValue(nums[i])++);
    //     }
    //     else{
    //         map.put(nums[i],1);
    //     }
 
    //  }
    //  return map.getKey(1);
    
    
int ans = 0;
for(int i=0;i<nums.length;i++){
    ans = ans ^ nums[i];
    System.out.println(ans);
}

return ans;
    }
}


