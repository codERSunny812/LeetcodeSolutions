/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function(nums) {
    let idx = 0;

    for(let i=0;i<nums.length;i++){
        if(nums[i] != 0){
            // swap it with the previous one 
            nums[idx++] = nums[i];
        }
    }



    // loop to fill the end of the array with 0
    for(let j=idx;j<nums.length;j++){
        nums[j]=0;
    }
};