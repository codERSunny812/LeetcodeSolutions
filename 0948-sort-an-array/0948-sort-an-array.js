/**
 * @param {number[]} nums
 * @return {number[]}
 */
var sortArray = function(nums) {

    // base case 
    if(nums.length <= 1) return nums;

    let mid = Math.floor(nums.length/2);

    const leftArr = sortArray(nums.slice(0,mid));
    const rightArr = sortArray(nums.slice(mid));


    return helperSorted(leftArr,rightArr);
    
};


function helperSorted(leftArr,rightArr){

  const m = leftArr.length;
  const n = rightArr.length;
  const res=[]; // empty array to store the sorted array 

  let i = 0; // pointer to the first idx of the left array 
  let j=0;    // pointer to the first idx of the right array 

  while(i<m && j<n){
    if(leftArr[i]<rightArr[j]){
      res.push(leftArr[i++]);
    }else{
        res.push(rightArr[j++]);
    }
  }

  return [...res,...leftArr.slice(i),...rightArr.slice(j)];
}