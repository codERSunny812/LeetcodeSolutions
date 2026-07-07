class Solution {
    public long sumAndMultiply(int n) {
        long  sum = 0;
        long  newNum = 0;
        long  reversedNum = 0;
        long  finalNum = 0;


        // getting the non zero number
        while(n!= 0){

            long lastDgt = n % 10;

            if( lastDgt != 0){
                sum +=  lastDgt;
                newNum = newNum*10 + lastDgt;
            }

            n = n/10;


        }


        // reversing the number
        while(newNum != 0){
         long lstDgt = newNum % 10;
         reversedNum = reversedNum*10 + lstDgt;
         newNum = newNum/10;
        }


        finalNum = reversedNum * sum;

        return finalNum;
    }
}