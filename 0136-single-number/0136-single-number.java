class Solution {
    public int singleNumber(int[] nums) {
     HashMap<Integer,Integer> map  = new HashMap<>();
     int ans = 0 ;
     for(int i = 0 ; i < nums.length ; i++){
        if(map.containsKey(nums[i])){
            map.put(nums[i],map.get(nums[i])+1);
        }
        else{
            map.put(nums[i],1);
        }
 
     }
     for(Map.Entry<Integer,Integer> e: map.entrySet()){
        if(e.getValue()==1){
            ans = e.getKey();
        }
     }
     
     return ans;
     }
}   
    
// int ans = 0;
// for(int i=0;i<nums.length;i++){
//     ans = ans ^ nums[i];
//     System.out.println(ans);
// }

// return ans;



