/**
 * @param {string} word
 * @return {boolean}
 */
var isValid = function(word) {

    if(word.length < 3) return false;

    let isContainVowels=false;
    let isContainConstant=false;

    const vowels = ['a', 'e', 'i', 'o', 'u'];

    for(let i=0;i<word.length;i++){
     const char = word[i];

    // Check if character is a digit or a letter
        if (!/[0-9a-zA-Z]/.test(char)) {
            return false; 
        }

       // Check if it's a letter
        if (/[a-zA-Z]/.test(char)) {
            const lowerChar = char.toLowerCase();

            if (vowels.includes(lowerChar)) {
                isContainVowels = true;
            } else {
                isContainConstant = true;
            }
        }
    }

    return isContainConstant &&  isContainVowels ;




    
};