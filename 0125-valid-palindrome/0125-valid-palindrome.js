/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {


    // console.log(s)
    // //convert to lower case 
    // s = s.toLowerCase();

    // console.log(s)

    // //convert into array 
    // s = s.split("").filter((ch)=>{
    //     return ( (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'))
    // });

    // console.log(s.join(""))


    // // check the array is palindrom or not 

    // let i=0;
    // let j=s.length-1;

    // console.log(i,j)

    // while(i<j){
    //     if(s[i]!== s[j]) return false;

    //     i++;
    //     j--;
    // }

    // return true;



        s = s.toLowerCase();

    console.log(s)
    let filteredStr = "";
    let rev = "";
    for(let i=0;i<s.length;i++){
        if(s[i].match(/[a-z0-9]/i)){
            filteredStr+=s[i];
            rev = s[i]+rev

        }

    }

    console.log(filteredStr);
    console.log(rev)

    return filteredStr === rev;




    
};