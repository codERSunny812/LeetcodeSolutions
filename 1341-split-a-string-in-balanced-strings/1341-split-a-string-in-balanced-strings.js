/**
 * @param {string} s
 * @return {number}
 */
var balancedStringSplit = function(s) {

    let lCount = 0;
    let rCount = 0;

    let balanceStrCount = 0;

    for(let i=0;i<s.length;i++){
        
        if(s[i] == 'L'){
            lCount++;
        }else{
            rCount++;
        }

        if(lCount == rCount) balanceStrCount++;
    }


    return balanceStrCount;
    
};