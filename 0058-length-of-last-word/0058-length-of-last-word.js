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
    let newLen = s.length-1;
    console.log("new string length after end space is removeed",newLen)
    let strLen = 0;

    for(let i=length;i>=0;i--){
        if(s[i] != " " ){
            strLen++;
        }else{
            break;
        }
    }

    return strLen;
};