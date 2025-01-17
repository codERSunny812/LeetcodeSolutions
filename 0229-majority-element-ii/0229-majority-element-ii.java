class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int length = nums.length;
        int maj = length/3;

        for(int i=0;i<length;i++){
            if(mpp.containsKey(nums[i])){
             mpp.put(nums[i],mpp.get(nums[i])+1);
            }else{
                mpp.put(nums[i],1); //every element will appear atleast once
            }
        }

        //now check for the majority element

        for(int occ : mpp.keySet()){
            if(mpp.get(occ) > maj){ //checked for the given condition 
                list.add(occ);
            }
        }

        return list;
    }
}