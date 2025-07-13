/**
 * @param {number[]} score
 * @return {string[]}
 */
var findRelativeRanks = function(score) {

    const sorted = [...score].sort((a, b) => b - a); // Descending
    const rankMap = new Map();

    for (let i = 0; i < sorted.length; i++) {
        if (i === 0) rankMap.set(sorted[i], "Gold Medal");
        else if (i === 1) rankMap.set(sorted[i], "Silver Medal");
        else if (i === 2) rankMap.set(sorted[i], "Bronze Medal");
        else rankMap.set(sorted[i], String(i + 1));
    }

    // Build result based on original order
    const result = score.map(val => rankMap.get(val));
    return result;
    
};