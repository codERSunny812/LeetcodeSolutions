
class Solution {
    public String longestCommonPrefix(String[] strs) {
   if(strs.length == 0){
       return "";
   }
   String prefix = strs[0];  //flower
   for(int i = 0; i<strs.length;i++){ // strs -->
       while(strs[i].indexOf(prefix)!=0){    //fl
           prefix = prefix.substring(0,prefix.length()-1);
       }
     
   }
     return prefix;
    }
}