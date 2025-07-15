/**
 * @param {number[]} nums
 * @param {number} k
 * @return {boolean}
 */
var containsNearbyDuplicate = function(nums, k) {


// approach 1
    
    // let count = 0;
    // let i =0;
    // let j = i+1;

    // while(i<nums.length){

    //     if( j >=  nums.length-1){
    //         i++;
    //         j=i+1;
    //     }

    //     if( (nums[i] == nums[j]) && (Math.abs(i-j) <= k) ){
    //         count++;
    //         i++;
    //         j++;
    //     }else{
    //     j++;
    //     }

    // }

    // if(count > 0) return true;

    // return false;


    // approach 2 

     for (let i = 0; i < nums.length; i++) {
        for (let j = i + 1; j <= i + k && j < nums.length; j++) {
            if (nums[i] === nums[j]) {
                return true;
            }
        }
    }
    return false;



};