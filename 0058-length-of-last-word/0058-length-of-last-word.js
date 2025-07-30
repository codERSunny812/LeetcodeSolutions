/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
    

    let length = s.length-1;
    console.log('s length',length)

    //remove the last space 

    while(length >= 0){
        if(s[length] == " "){
            --length;
        }else{
            break;
        }
    }


    // new length after the end space is removed
     const newLen = length
    let strLen = 0;

    for(let i=newLen;i>=0;i--){
        if(s[i] != " " ){
            strLen++;
        }else{
            break;
        }
    }

    return strLen;
};