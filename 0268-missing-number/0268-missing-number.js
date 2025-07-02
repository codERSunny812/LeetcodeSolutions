/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    let length = nums.length;

    let originalSum = (length * (length + 1))/2;

    let ArrayElementSum = findSum(nums);

    function findSum(nums){
        let sum = 0;

        for(let i=0;i<nums.length;i++){
            sum = sum+nums[i];
        }

        return sum;
    }



    return originalSum - ArrayElementSum;
};