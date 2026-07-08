class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

//sort the arrya 
        Arrays.sort(nums);

        //creating an array list
        List<List<Integer>> lpp = new ArrayList<>();

        int n = nums.length;

        for(int i=0;i<n-3;i++){
             //skip the dublicate element
            if(i> 0 && nums[i] == nums[i-1]) continue;

            for (int j=i+1;j<n-2;j++){
            
              if(j> i+1 && nums[j] == nums[j-1]) continue;

            int left = j+1;
            int right = n-1;


            while(left < right){
                long sum = (long) nums[left]+nums[right]+nums[i]+nums[j];

                if(sum == target){
                    //added in the list
                    lpp.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                    left++;
                    right--;

                    //check for dublicate 

                    while(left < right && nums[left] == nums[left-1]){
                        left++;
                    }

                    while(left < right  && nums[right] == nums[right+1]){
                        right--;
                    }
                }else if(sum < target){
                    left++;
                }else{
                    right--;
                }
            }
            }
        }

        return lpp;
    }
}