/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    
    // handle the corner case
    if(nums.length < 0) return 0;
    let i = 0; // one pointer to the starting of the array

    for(let j = 0; j< nums.length;j++){
        if(nums[j] > nums[i]){
            i=i+1;
            nums[i] = nums[j]; // putting the unique elements
        }
    }

    return i+1;
};