class Solution {
    public int[] twoSum(int[] nums, int target) {
    
        // approach - 1 
//         for(int i =0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]+nums[j] == target){
//                    return new int[] {i,j};
//                 }
//             }
            
//         }
// return  new int[0];



// approach 2 
HashMap<Integer,Integer> mpp = new HashMap<>();
for(int i=0;i<nums.length;i++){
    int diff = target - nums[i];

    if(mpp.containsKey(diff)){
        return new int[] { mpp.get(diff),i };
    }

    mpp.put(nums[i],i);
}

return new int[] {};
    }
}