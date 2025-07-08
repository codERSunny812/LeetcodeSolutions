/**
 * @param {number} n
 * @return {boolean}
 */
var isPowerOfThree = function(n) {
    if(n == 1) return true;

    if(n < 1 || n %2 == 0) return false;

    return isPowerOfThree(n/3);
};