/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {

const xCopy = x;

// check for the negative case
if(x < 0){
    return false;
}

// handle the single digit case
if(x < 10) return true;

let reverse=0;

while(x > 0){
    let lastDigit = x%10;
    reverse = reverse*10 + lastDigit;
    x = Math.floor(x/10);
}

if(xCopy == reverse){
    return true
}

return false;


};