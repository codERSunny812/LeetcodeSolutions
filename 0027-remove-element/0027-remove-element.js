/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function(nums, val) {

if(nums.length < 0) return 0;

 let i =0;
 for(let j=0;j<nums.length;j++){
    if(nums[j] != val){
        nums[i] = nums[j];
        i=i+1;
    }
 }   
 return i;
};