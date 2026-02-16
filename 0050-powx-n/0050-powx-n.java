class Solution {
    public double myPow(double x, int n) {
        long exp = n;  // Safe abs
        boolean neg = exp < 0;
        exp = Math.abs(exp);
        double ans = 1.0;
        double base = x;
        while (exp > 0) {
            if ((exp & 1) == 1) ans *= base;
            base *= base;
            exp >>= 1;  // exp /= 2
        }
        return neg ? 1 / ans : ans;
    }
}




// class Solution {
//     public double myPow(double x, int n) {
//         double ans = 0.0;
//         int p = Math.abs(n);
//         ans = pow(x,p);
        
//         if(n<0){
//             return 1/ans;
//         }
        
//         return ans;
//      }
     
//       static double pow(double base, int power){
//         if( power == 0 ) return 1;       
        
//        return base*pow(base,power-1);
//      }
// }

