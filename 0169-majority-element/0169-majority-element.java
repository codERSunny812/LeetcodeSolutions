class Solution {
    public int majorityElement(int[] nums) {
        // int length = nums.length;
        // int maj = length/2;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            //check the freq of num
            if(map.containsKey(nums[i])){
              map.put(nums[i],map.get(nums[i])+1);
            }else{
              map.put(nums[i],1);
            }
        }

        // check for the majority element 
        for(int occ : map.keySet()){
            if(map.get(occ) > nums.length/2){
                return occ;
            }
        }
        return -1;
    }
}