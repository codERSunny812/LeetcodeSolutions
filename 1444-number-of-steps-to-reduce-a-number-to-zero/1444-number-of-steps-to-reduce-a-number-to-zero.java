class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        return helperFun(num , count  );
        
    }

    private static int helperFun(int num , int steps){

        // base condition
        if(num == 0 ){
            return steps;
        }

        // check the number is odd or even
        if(num %2 == 0){
            return helperFun(num/2 , steps+1);
        }
         return helperFun(num-1, steps+1);




    }
}