class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int k = nums.length -1;
        int arr[] = new int[nums.length];

        while(i<=j){
            int left = nums[i]*nums[i];
            int right = nums[j]*nums[j];
           System.out.println("left = " + left);
           System.out.println("right = " + right);



            if(left < right){
                arr[k]= right;
                k--;
                j--;
            }else{
                arr[k] = left;
                k--;
                i++;
            }

        }

        return arr;
    }
}