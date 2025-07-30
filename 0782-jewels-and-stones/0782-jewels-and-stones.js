/**
 * @param {string} jewels
 * @param {string} stones
 * @return {number}
 */
var numJewelsInStones = function(jewels, stones) {
    let stoneCount = 0;

    // approach -1

    // for(let i=0;i<stones.length;i++){
    //     console.log(stones[i])
    //     if(jewels.includes(stones[i])){
    //         stoneCount++;
    //     }
    // }


    // approach - 2

    let jSet = new Set();

    for(let i=0;i<jewels.length;i++){
        jSet.add(jewels[i]);
    }


      for(let i=0;i<stones.length;i++){
        if(jSet.has(stones[i])){
        stoneCount++;
        }
    }


    return stoneCount;
    
};