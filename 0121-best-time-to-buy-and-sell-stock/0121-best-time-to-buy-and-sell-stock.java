class Solution {
    public int maxProfit(int[] prices) {
//         Wrong Answer
// 129 / 212 testcases passed
//|| prices[i]>prices[i+1]
// Editorial
// Input
// prices =
// [2,4,1]
        
        //[2,1,4]
        // int len = prices.length;
        // int i = 0 ; 
        // int j = len-1;
        // int max= 0;
        // while(i<j){
        //     if(prices[i]>prices[j]){
        //         i++;
        //     }
        //     else{
        //         if( max < prices[j]-prices[i]){
        //             max = prices[j]-prices[i];
        //         }
               
        //        j--;
                
        //     }
        // }
        
        // return max;


// int prices_length = prices.length; //6
// int profit = Integer.MAX_VALUE; 
// int loss = Integer.MIN_VALUE;
// int profit_idx=0;//1

// System.out.print("value at the start");
// System.out.println(loss);
// System.out.println(profit);

// for(int i=0;i<prices_length;i++){
//     if(prices[i] < profit){
//         profit = prices[i];
//         profit_idx = i;
//     }
// }
// System.out.print(profit_idx);

// for(int j=profit_idx;j<prices_length;j++){
//     if(prices[j] > loss){
//         loss = prices[j];
//     }
// }


// System.out.print("value at the end");

// System.out.println(loss);
// System.out.println(profit);


// return loss - profit;

int buyPrice = prices[0];
int maxProfit  = 0;

for(int i=0;i<prices.length;i++){
    if(prices[i] - buyPrice > maxProfit){
        maxProfit = prices[i] - buyPrice;
    }
    
    if(prices[i] < buyPrice){
        buyPrice = prices[i];
    }
}

return maxProfit;

    }
}
























