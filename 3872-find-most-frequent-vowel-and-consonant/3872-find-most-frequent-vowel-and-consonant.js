/**
 * @param {string} s
 * @return {number}
 */
var maxFreqSum = function(s) {

    let mpp = new Map();
    let spp = new Set(['a','e','i','o','u']);

    for(let i=0;i<s.length;i++){
        let char = s[i];

        if(!(mpp.get(char))){
            mpp.set(char,1)
        }else{
            mpp.set(char,(mpp.get(char)+1));
        }
    }


    let vowelCount = 0;  //vowels count 
    let consonantCount = 0;  //consonant count

    mpp.forEach((value, key) => {
        if (spp.has(key)) {
            vowelCount = Math.max(vowelCount, value);
        } else {
            consonantCount = Math.max(consonantCount, value);
        }
    });


    return vowelCount+ consonantCount;



    
};