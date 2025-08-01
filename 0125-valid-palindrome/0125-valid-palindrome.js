/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {


    console.log(s)
    //convert to lower case 
    s = s.toLowerCase();

    console.log(s)

    //convert into array 
    s = s.split("").filter((ch)=>{
        return ( (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'))
    });

   

    

    console.log(s.join(""))


    // check the array is palindrom or not 

    let i=0;
    let j=s.length-1;

    console.log(i,j)

    while(i<j){
        if(s[i]!== s[j]) return false;

        i++;
        j--;
    }

    return true;
    
};