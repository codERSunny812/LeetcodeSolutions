class Solution {
    public int[] sortedSquares(int[] nums) {
         
         //approach -1 

        // int arrLen = nums.length;
        // ArrayList<Integer> neg = new ArrayList<>();
        // ArrayList<Integer> pos = new ArrayList<>();


        // each number is  added to the separate array 
        // for(int i=0;i<arrLen;i++){
        //     if(nums[i] >= 0){
        //      pos.add(nums[i]);
        //     }else{
        //      neg.add(nums[i]);
        //     }
        // }

        // now negative number
        // if(neg.size() == 0){
        //     for(int i=0;i<pos.size();i++){
        //         pos.set(i,pos.get(i)*pos.get(i));
        //     }

        //     return pos.stream().mapToInt(Integer::intValue).toArray();

        // }
         
        // no positive value 
        // if(pos.size() == 0){
        //  for(int i=0;i<neg.size();i++){
        //         neg.set(i,neg.get(i)*neg.get(i));
        //     }

        //     //reverse the array now
        //     Collections.reverse(neg);

        //     return neg.stream().mapToInt(Integer::intValue).toArray();

        // }

        // if array has both values 
        // int i=0;
        // int j=0;
        // int id = 0;
        // int l1 = neg.size();
        // int l2 = pos.size();
        // int newLen = l1+l2;
        // int [] arr = new int[newLen];

        // square the negative number and reverse them 
        // for(int k=0;k<neg.size();k++){
        //     neg.set(k,neg.get(k)*neg.get(k));
        // }


        // Collections.reverse(neg);

        //square the postive number 
        // for(int k=0;k<pos.size();k++){
        //     pos.set(k,pos.get(k)*pos.get(k));
        // }


        //merge both the  sorted array 
        // while(i<l1 && j<l2){
          
        //   if(neg.get(i) <= pos.get(j)){
        //     arr[id++] = neg.get(i++);
        //   }else{
        //     arr[id++] = pos.get(j++);
        //   }
        // }


        // while(i<l1){
        // arr[id++] = neg.get(i++);
        // }

        // while(j<l2){
        //  arr[id++] = pos.get(j++);
        // }


        // return arr;

        //approach -2 
        int n = nums.length;
        int pt_1 = 0;
        int pt_2 = n-1;
        int idx = n-1;
        int [] res = new int[n];


        while(pt_1 <= pt_2){
            int leftDigit = nums[pt_1]*nums[pt_1];
            int rightDigit = nums[pt_2]*nums[pt_2];

            if(leftDigit > rightDigit){
              res[idx--] = leftDigit;
              pt_1++;
            }else{
                res[idx--] = rightDigit;
                pt_2 --;
            }
        }

return res;


    }
}