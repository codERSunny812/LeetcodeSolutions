class Solution {

    boolean checkWin(int n){
        //base case
        if(n<=3) return true;

        if(n%4==0) return false;

        return true;
    }
    public boolean canWinNim(int n) {
        
        boolean result = checkWin(n);
        

        return result;
    }
}
