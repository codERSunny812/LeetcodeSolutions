// //optimized
class Solution {
    public int climbStairs(int n) {
        if (n <= 1) return 1;
        int prev = 1, curr = 1;
        for (int i = 2; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }
}


//DP 
// class Solution {
//     public int climbStairs(int n) {
//         if (n <= 1) return 1;  // n=0:1 (do nothing), n=1:1 (one step)
//         if (n < 0) return 0;
//         return climbStairs(n-1) + climbStairs(n-2);  // Sum ways
//     }
// }
