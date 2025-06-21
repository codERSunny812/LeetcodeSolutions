/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    
    let buyPrice = prices[0]; // we have supposed that we have buy the stock on the 1st day
    let maxProfit = 0;

    for(let i=1;i< prices.length;i++){
        // check for the condition 
        if(prices[i] - buyPrice > maxProfit){
            maxProfit = prices[i] - buyPrice;
        }

        //update the buy price too if you found any price lessser than that 

        if(prices[i] < buyPrice){
            buyPrice = prices[i];
        }
    }

    return maxProfit;
    
};