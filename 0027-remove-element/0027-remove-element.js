/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function(nums, val) {

// handle the corner case
if(nums.length < 0) return 0;

// pointer at the index 0 of the array
 let i =0;
 for(let j=0;j<nums.length;j++){
    // only swap if the value is not equal to the val 
    if(nums[j] != val){
        nums[i] = nums[j];
        i=i+1;
    }
 }   
 return i;
};