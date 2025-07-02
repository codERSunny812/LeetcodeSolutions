/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxConsecutiveOnes = function(nums) {
    var count = 0;
    var maxCount = 0;

    for(let i = 0;i< nums.length;i++){
        //checking the nums element 

        if(nums[i] != 0){
            count++;
        }else{
        count = 0;
        }

        if(count > maxCount){
            maxCount = count;
        }
    }

    return maxCount;
};