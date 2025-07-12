var thirdMax = function (nums) {

    let firstMax = -Infinity;
    let secondMax = -Infinity;
    let thirdMax = -Infinity;

    // function to  find the first max
    function findFirstMax(nums) {

        for (let i = 0; i < nums.length; i++) {
            if (nums[i] > firstMax) {
                firstMax = nums[i];
            }
        }

    }

    // function to find the second max 
    function findSecondMax(nums) {

        for (let i = 0; i < nums.length; i++) {
            if ((nums[i] > secondMax) && (nums[i] < firstMax)) {
                secondMax = nums[i];
            }
        }

    }

    //  function to find the third max 
    function findThirdMax(nums) {
        for (let i = 0; i < nums.length; i++) {
            if ( (nums[i] > thirdMax) && (nums[i] < firstMax) && (nums[i] < secondMax)) {
                thirdMax = nums[i];
            }
        }
    }


    findFirstMax(nums); // function to  find the first maximum
    findSecondMax(nums); // function to find the second maximum
    findThirdMax(nums); // function to find the third maximum 

    if(thirdMax != -Infinity){
        return thirdMax;
    }

    return firstMax;
   

};





