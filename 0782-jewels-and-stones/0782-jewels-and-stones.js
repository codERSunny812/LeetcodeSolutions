/**
 * @param {string} jewels
 * @param {string} stones
 * @return {number}
 */
var numJewelsInStones = function(jewels, stones) {
    let stoneCount = 0;

    for(let i=0;i<stones.length;i++){
        console.log(stones[i])
        if(jewels.includes(stones[i])){
            stoneCount++;
        }
    }


    return stoneCount;
    
};