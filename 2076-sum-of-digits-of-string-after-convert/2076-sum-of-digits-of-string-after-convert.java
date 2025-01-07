class Solution {
    public int getLucky(String s, int k) {
        String str = "";//empty string to store the numeric string

        for(int i=0;i<s.length();i++){
            str+= s.charAt(i)-'a'+1;
        }

        int sum = 0; //variable to store the sum

        while(k > 0){
            sum=0;
          for(char ch: str.toCharArray()){
            sum+= Character.getNumericValue(ch);
          }

          str = String.valueOf(sum);
          k--;
        }

        return sum;

    }
}