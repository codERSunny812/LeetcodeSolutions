/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var search = function(nums, target) {

    let left = 0;
    let end  = nums.length -1;

    while(left <= end){

        let mid = Math.floor((left+end)/2);

        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid] < target){
            left = mid+1;
        }else{
            end = mid-1;
        }
    }


    return -1;
    
};