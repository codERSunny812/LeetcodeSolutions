/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
    let idx = 0;

    for(let i=0;i<nums.length;i++){
        idx = idx ^ nums[i];

    }

    return idx;
    
};