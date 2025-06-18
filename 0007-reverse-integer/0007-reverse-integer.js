/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
   let lastDigit;
   let reverse = 0;

   let xCopy = Math.abs(x);

   

   while(xCopy > 0){
    lastDigit = xCopy%10;
    reverse = reverse*10 + lastDigit;
    xCopy = Math.floor(xCopy/10);
   } 

   if (reverse < Math.pow(-2, 31) || reverse > Math.pow(2, 31) - 1) return 0;


   
 return  x < 0 ? -reverse : reverse;


  

  
};